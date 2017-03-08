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
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StatisticTEST {

	private long wins;

	private long defeats;

	private long totalPlayed;

	private double winRate;

	private double defeatRate;

	private static final List<Fight> ALL_FIGHTS = Fight.getAll();

	public StatisticTEST(Collection<Fight> data) {
		FightResult wonAndLostFights = getOverallWinsAndDefeats();
		this.wins = wonAndLostFights.getWonFights().size();
		this.defeats = wonAndLostFights.getLostFights().size();
		this.totalPlayed = wins + defeats;

		double doubleWins = (double) wins;
		double doubleTotalPlayed = (double) totalPlayed;
		double doubleDefeats = (double) defeats;

		winRate = doubleWins / doubleTotalPlayed;
		defeatRate = doubleDefeats / doubleTotalPlayed;
	}

	private static FightResult getOverallWinsAndDefeats() {
		Collection<Fight> wonFights = ALL_FIGHTS.stream().filter(fight -> fight.getResult().equals(Result.WIN))
				.collect(toList());
		Collection<Fight> lostFights = ALL_FIGHTS.stream().filter(fight -> fight.getResult().equals(Result.DEFEAT))
				.collect(toList());

		return new FightResult(wonFights, lostFights);
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
		FightInformation informationOfWonFights = retrieveInformationOfWonFights(fightsForCombination);
		FightInformation informationOfLostFights = retrieveInformationOfLostFights(fightsForCombination);

		System.out.println("WON: " + informationOfWonFights.getFights().size());
		System.out.println("LOST: " + informationOfLostFights.getFights().size());

		print(informationOfWonFights);
		print(informationOfLostFights);
	}

	private static FightInformation retrieveInformationOfWonFights(List<Fight> fightsForCombination) {
		Collection<Fight> wonFightsForCombination = retrieveWonFights(fightsForCombination);
		List<Collection<Talent>> buildsThatWonFight = retrieveBuildsForCombinations(wonFightsForCombination);
		Collection<Talent> mostValueableBuild = getMostValueableBuild(buildsThatWonFight);
		Class mostValueableFocusTarget = getMostValueableFocusTarget(wonFightsForCombination);
		Collection<String> notesForWonCombinations = retrieveNotesForWonCombinations(wonFightsForCombination);

		return new FightInformation(buildsThatWonFight, mostValueableBuild, mostValueableFocusTarget,
				notesForWonCombinations, null, null, wonFightsForCombination);
	}

	private static FightInformation retrieveInformationOfLostFights(List<Fight> fightsForCombination) {
		Collection<Fight> lostFightsForCombination = retrieveLostFights(fightsForCombination);
		Collection<String> notesForLostCombinations = retrieveNotesForLostCombinations(fightsForCombination);
		List<Collection<Talent>> buildsThatLostFights = retrieveBuildsForCombinations(fightsForCombination);

		return new FightInformation(null, null, null, null, notesForLostCombinations, buildsThatLostFights,
				lostFightsForCombination);

	}

	private static void print(FightInformation fightInformation) {
		System.out.println("\n\nSearch for the most valueable option ... \n");

		System.out.println("BUILD: " + fightInformation.getMostValueableBuild());
		System.out.println("FOCUS: " + fightInformation.getMostValueableFocusTarget());
		System.out.println("Helpful notes from won battles: " + fightInformation.getNotesForWonCombinations());
		System.out.println("Helpful notes from lost battles: " + fightInformation.getNotesForLostCombinations());
		System.out.println(
				"Matches were lost with the following builds: " + fightInformation.getBuildsThatLostFights() + "\n\n");

		printOverallClassPresence();
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

	private static Class getMostValueableFocusTarget(Collection<Fight> fightsToEvaluate) {
		if (!fightsToEvaluate.isEmpty()) {
			return Collections
					.max(fightsToEvaluate.stream().collect(groupingBy(Function.identity(), counting())).entrySet(),
							(entry1, entry2) -> toIntExact(entry1.getValue() - entry2.getValue()))
					.getKey().getFocus();
		}
		return Class.NONE;
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
