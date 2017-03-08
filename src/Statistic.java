import static java.lang.Math.toIntExact;
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
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Statistic {

	private long wins;

	private long defeats;

	private long totalPlayed;

	private double winRate;

	private double defeatRate;

	private static final List<Fight> ALL_FIGHTS = Fight.getAll();

	public Statistic(Collection<Fight> data) {
		this.wins = retrieveWonFights(data).size();
		this.defeats = retrieveLostFights(data).size();
		this.totalPlayed = wins + defeats;

		winRate = (double) wins / (double) totalPlayed;
		defeatRate = (double) defeats / (double) totalPlayed;
	}

	public static void printStatsForCombination(Combination combination) {
		System.out.println("\n\nRetrieving matches for combination [" + combination.getFirstClass() + " / "
				+ combination.getSecondClass() + "] ...");
		List<Fight> fightsForCombination = ALL_FIGHTS.stream()
				.filter(fight -> fight.getCombination().equals(combination)).collect(Collectors.toList());

		if (fightsForCombination.isEmpty()) {
			System.out.println("\n\nYou haven't played against this combination yet.\n\n");
			printOverallClassPresence();
			return;
		}

		Collection<Fight> wonFightsForCombination = retrieveWonFights(fightsForCombination);
		Collection<Fight> lostFightsForCombination = retrieveLostFights(fightsForCombination);
		System.out.println("WON: " + wonFightsForCombination.size());
		System.out.println("LOST: " + lostFightsForCombination.size());

		gatherInformation(wonFightsForCombination, lostFightsForCombination);
		printOverallClassPresence();
	}

	private static void gatherInformation(Collection<Fight> wonFightsForCombination,
			Collection<Fight> lostFightsForCombination) {
		System.out.println("\n\nSearch for the most valueable option ... \n");

		// Highest winrate, Talents and focus on won fights
		List<Collection<Talent>> wonBuilds = retrieveBuildsForCombinations(wonFightsForCombination);
		System.out.println("BUILD: " + getMostValueableBuild(wonBuilds));
		System.out.println("FOCUS: " + getMostValueableFocusTarget(wonFightsForCombination));

		System.out
				.println("Helpful notes from won battles: " + retrieveNotesForWonCombinations(wonFightsForCombination));
		System.out.println(
				"Helpful notes from lost battles: " + retrieveNotesForLostCombinations(lostFightsForCombination));
		List<Collection<Talent>> lostBuilds = retrieveBuildsForCombinations(lostFightsForCombination);
		System.out
				.println("Matches were lost with the following builds: " + getLeastValueableBuild(lostBuilds) + "\n\n");

	}

	private static void printOverallClassPresence() {
		System.out.println("OVERALL CLASS PRESENCE:\n");

		Map<Class, Long> classCounts = ALL_FIGHTS.stream().map(Fight::getCombination)
				.flatMap(combination -> Stream.of(combination.getFirstClass(), combination.getSecondClass()))
				.collect(groupingBy(Function.identity(), counting()));

		calculatePresence(classCounts);
	}

	private static void calculatePresence(Map<Class, Long> classCounts) {
		double sumOfClassCounts = classCounts.values().stream().mapToDouble(count -> count.doubleValue()).sum();

		classCounts.entrySet().stream().sorted(Map.Entry.<Class, Long>comparingByValue().reversed()).forEach(entry -> {
			BigDecimal averagePerClass = new BigDecimal(entry.getValue() / sumOfClassCounts)
					.round(new MathContext(3, RoundingMode.HALF_UP));
			System.out.println(entry.getKey() + " = " + averagePerClass.doubleValue() * 100 + "%");
		});
		;
	}

	private static Collection<Talent> getMostValueableBuild(List<Collection<Talent>> buildsPlayedOnWonFights) {
		if (!buildsPlayedOnWonFights.isEmpty()) {
			return Collections
					.max(buildsPlayedOnWonFights.stream().collect(groupingBy(Function.identity(), counting()))
							.entrySet(), (entry1, entry2) -> toIntExact(entry1.getValue() - entry2.getValue()))
					.getKey();
		}
		return Collections.emptyList();
	}

	private static Set<Collection<Talent>> getLeastValueableBuild(List<Collection<Talent>> buildsPlayedOnLostFights) {
		return buildsPlayedOnLostFights.stream().collect(groupingBy(Function.identity(), counting())).keySet();
	}

	private static Class getMostValueableFocusTarget(Collection<Fight> fightsToEvaluate) {
		if (!fightsToEvaluate.isEmpty()) {
			return Collections
					.max(fightsToEvaluate.stream().collect(groupingBy(Function.identity(), counting())).entrySet(),
							(entry1, entry2) -> toIntExact(entry1.getValue() - entry2.getValue()))
					.getKey().getFocus();
		}
		return Class.NONE;
	}

	private static Collection<Fight> retrieveWonFights(Collection<Fight> fightsToEvaluate) {
		return fightsToEvaluate.stream().filter(fight -> fight.getResult().equals(Result.WIN)).collect(toList());
	}

	private static Collection<Fight> retrieveLostFights(Collection<Fight> fightsToEvaluate) {
		return fightsToEvaluate.stream().filter(fight -> fight.getResult().equals(Result.DEFEAT)).collect(toList());
	}

	private static Collection<String> retrieveNotesForWonCombinations(Collection<Fight> fightsForCombination) {
		return fightsForCombination.stream().filter(fight -> !fight.getNote().isEmpty()).map(fight -> fight.getNote())
				.distinct().collect(toList());
	}

	private static Collection<String> retrieveNotesForLostCombinations(Collection<Fight> fightsForCombination) {
		return fightsForCombination.stream().filter(fight -> !fight.getNote().isEmpty()).map(fight -> fight.getNote())
				.distinct().collect(toList());
	}

	private static List<Collection<Talent>> retrieveBuildsForCombinations(Collection<Fight> fightsForCombination) {
		return fightsForCombination.stream().map(fight -> fight.getTalents()).collect(toList());
	}

	public long getWins() {
		return wins;
	}

	public long getDefeats() {
		return defeats;
	}

	public long getTotalPlayed() {
		return totalPlayed;
	}

	public double getWinRate() {
		return winRate;
	}

	public double getDefeatRate() {
		return defeatRate;
	}

	@Override
	public String toString() {
		return "TOTAL PLAYED: " + getTotalPlayed() + "\nWON: " + getWins() + "\nLOST: " + getDefeats() + " \nWIN-RATE: "
				+ getWinRate() + "\nLOOSE-RATE: " + getDefeatRate();
	}
}
