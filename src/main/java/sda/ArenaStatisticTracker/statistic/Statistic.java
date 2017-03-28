package sda.ArenaStatisticTracker.statistic;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import sda.ArenaStatisticTracker.build.Build;
import sda.ArenaStatisticTracker.build.Talent;
import sda.ArenaStatisticTracker.fight.Combination;
import sda.ArenaStatisticTracker.fight.Fight;
import sda.ArenaStatisticTracker.fight.FightInformation;
import sda.ArenaStatisticTracker.fight.Result;
import sda.ArenaStatisticTracker.fight.WoWClass;



public final class Statistic {

    private GeneralStatisticInformation generalStatisticInformation;

    private final Collection<Fight> fights;

    public Statistic(Collection<Fight> data) {
        long wins = retrieveFights(data, Result.WIN).size();
        long defeats = retrieveFights(data, Result.DEFEAT).size();
        long totalPlayed = wins + defeats;

        double winRate = (double) wins / (double) totalPlayed;
        double defeatRate = (double) defeats / (double) totalPlayed;

        generalStatisticInformation = new GeneralStatisticInformation(wins, defeats, totalPlayed, winRate, defeatRate);
        this.fights = data;
    }

    public FightInformation getStatisticForCombination(Combination combination) {
        List<Fight> fightsForCombination = fights
                .stream()
                .filter(fight -> fight.getCombination().equals(combination))
                .collect(Collectors.toList());

        Collection<Fight> wonFightsForCombination = retrieveFights(fightsForCombination, Result.WIN);
        Collection<Fight> lostFightsForCombination = retrieveFights(fightsForCombination, Result.DEFEAT);

        return analyzeInformationForCombination(wonFightsForCombination, lostFightsForCombination);
    }

    Map<sda.ArenaStatisticTracker.fight.WoWClass, Double> getOverallClassOccurrence() {
        Map<sda.ArenaStatisticTracker.fight.WoWClass, Long> classCounts = fights.stream().flatMap(fight -> fight.getCombination().getClasses().stream()).collect(
                groupingBy(Function.identity(), counting()));
        return calculatePresence(classCounts);
    }

    private FightInformation analyzeInformationForCombination(Collection<Fight> wonFightsForCombination,
            Collection<Fight> lostFightsForCombination) {
        // Highest win-rate, talents and focus on won fights
        Collection<Build> wonBuilds = retrieveBuildsForCombinations(wonFightsForCombination);
        Build mostValuableBuild = new Build(getMostValuableTalents(wonBuilds));
        WoWClass mostValuableFocusTarget = getMostValuableFocusTarget(wonFightsForCombination);
        Collection<String> notesForWonCombinations = retrieveNotesForCombinations(wonFightsForCombination);
        Collection<String> notesForLostCombinations = retrieveNotesForCombinations(lostFightsForCombination);
        Collection<Build> lostBuilds = retrieveDistinctBuildsForCombinations(lostFightsForCombination);

        return new FightInformation(wonBuilds, mostValuableBuild, mostValuableFocusTarget, notesForWonCombinations,
                notesForLostCombinations, lostBuilds, wonFightsForCombination.size(), lostFightsForCombination.size());
    }

    private Map<WoWClass, Double> calculatePresence(Map<WoWClass, Long> classCounts) {
        double sumOfClassCounts = classCounts.values().stream().mapToDouble(classCount -> classCount.doubleValue()).sum();

        return classCounts.entrySet().stream().collect(Collectors.toMap(entry -> entry.getKey(),
                entry -> new BigDecimal(entry.getValue() / sumOfClassCounts).round(new MathContext(3, RoundingMode.HALF_UP)).doubleValue()
                        * 100));
    }

    Set<Talent> getMostValuableTalents(Collection<Build> buildsPlayedOnWonFights) {
        if (!buildsPlayedOnWonFights.isEmpty()) {
            return Collections
                    .max(buildsPlayedOnWonFights.stream().collect(groupingBy(Build::getBuild, counting())).entrySet(),
                            (entry1, entry2) -> Math.toIntExact(entry1.getValue() - entry2.getValue()))
                    .getKey();
        }
        return Collections.emptySet();
    }

    WoWClass getMostValuableFocusTarget(Collection<Fight> fightsToEvaluate) {
        if (!fightsToEvaluate.isEmpty()) {
            return Collections
                    .max(fightsToEvaluate.stream().collect(groupingBy(Fight::getFocus, counting())).entrySet(),
                            (entry1, entry2) -> Math.toIntExact(entry1.getValue() - entry2.getValue()))
                    .getKey();
        }
        return WoWClass.NONE;
    }

    Collection<Fight> retrieveFights(Collection<Fight> fightsToEvaluate, Result result) {
        return fightsToEvaluate.stream().filter(fight -> fight.getResult().equals(result)).collect(toList());
    }

    Collection<String> retrieveNotesForCombinations(Collection<Fight> fightsForCombination) {
        return fightsForCombination
                .stream()
                .filter(fight -> !fight.getNote().isEmpty())
                .map(fight -> fight.getNote())
                .distinct()
                .collect(toList());
    }

    Collection<Build> retrieveBuildsForCombinations(Collection<Fight> fightsForCombination) {
        return fightsForCombination.stream().map(fight -> fight.getBuild()).collect(toList());
    }

    Collection<Build> retrieveDistinctBuildsForCombinations(Collection<Fight> fightsForCombination) {
        return fightsForCombination.stream().map(fight -> fight.getBuild()).filter(distinctByKey(Build::getBuild)).collect(toList());
    }

    <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<Object, Boolean>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    GeneralStatisticInformation getGeneralStatisticInformation() {
        return generalStatisticInformation;
    }
}
