package statistic;

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
import java.util.stream.Stream;

import fight.Class;
import fight.Combination;
import fight.Fight;
import fight.FightInformation;
import fight.Result;
import skill.Build;
import skill.Talent;

public class Statistic {

	private long wins;

	private long defeats;

	private long totalPlayed;

	private double winRate;

	private double defeatRate;

	private final Collection<Fight> allFights;

	public Statistic(Collection<Fight> data) {
		this.wins = retrieveWonFights(data).size();
		this.defeats = retrieveLostFights(data).size();
		this.totalPlayed = wins + defeats;

		winRate = (double) wins / (double) totalPlayed;
		defeatRate = (double) defeats / (double) totalPlayed;
		this.allFights = data;
	}

	/**
	 * Prints information about all given fights, which includes:
	 * <p>
	 * <ul>
	 * <li>Total played</li>
	 * <li>Won</li>
	 * <li>Lost</li>
	 * <li>Win-Rate</li>
	 * <li>Loose-Rate</li> defeats
	 * </ul>
	 */
	public void printGeneralInformation() {
		System.out.println("TOTAL PLAYED: " + totalPlayed + "\nWON: " + wins + "\nLOST: " + defeats + " \nWIN-RATE: "
				+ winRate + "\nLOOSE-RATE: " + defeatRate);
	}

	/**
	 * Prints all relevant information for the given combination of classes,
	 * which includes:
	 * <ul>
	 * <li>The most Valuable build</li>
	 * <li>The most Valuable focus target</li>
	 * <li>Helpful notes of won fights</li>
	 * <li>Helpful notes of lost fights</li>
	 * <li>Builds for lost fights</li>
	 * </ul>
	 * 
	 * @param combination
	 *            The combination you are faced with.
	 */
	public void printStatsForCombination(Combination combination) {
		System.out.println("\n\nRetrieving matches for combination [" + combination.getFirstClass() + " / "
				+ combination.getSecondClass() + "] ...");
		List<Fight> fightsForCombination = allFights.stream()
				.filter(fight -> fight.getCombination().equals(combination)).collect(Collectors.toList());

		if (fightsForCombination.isEmpty()) {
			System.out.println("\n\nYou haven't played against this combination yet.\n\n");
		}
		Collection<Fight> wonFightsForCombination = retrieveWonFights(fightsForCombination);
		Collection<Fight> lostFightsForCombination = retrieveLostFights(fightsForCombination);
		System.out.println("WON: " + wonFightsForCombination.size());
		System.out.println("LOST: " + lostFightsForCombination.size());

		FightInformation informationForCombination = analyzeInformationForCombination(wonFightsForCombination,
				lostFightsForCombination);
		printInformationForCombination(informationForCombination);
	}

	/**
	 * Prints the overall class presence for the given fights.
	 */
	public void printOverallClassPresence(Collection<Fight> fights) {
		System.out.println("OVERALL CLASS PRESENCE:\n");

		Map<Class, Long> classCounts = fights.stream().map(Fight::getCombination)
				.flatMap(combination -> Stream.of(combination.getFirstClass(), combination.getSecondClass()))
				.collect(groupingBy(Function.identity(), counting()));

		calculatePresence(classCounts);
	}

	private FightInformation analyzeInformationForCombination(Collection<Fight> wonFightsForCombination,
			Collection<Fight> lostFightsForCombination) {
		System.out.println("\n\nSearch for the most Valuable option ... \n");

		// Highest win-rate, talents and focus on won fights
		Collection<Build> wonBuilds = retrieveBuildsForCombinations(wonFightsForCombination);
		Build mostValuableBuild = new Build(getMostValuableTalents(wonBuilds));
		Class mostValuableFocusTarget = getMostValuableFocusTarget(wonFightsForCombination);
		Collection<String> notesForWonCombinations = retrieveNotesForCombinations(wonFightsForCombination);
		Collection<String> notesForLostCombinations = retrieveNotesForCombinations(lostFightsForCombination);
		Collection<Build> lostBuilds = retrieveDistinctBuildsForCombinations(lostFightsForCombination);

		return new FightInformation(wonBuilds, mostValuableBuild, mostValuableFocusTarget, notesForWonCombinations,
				notesForLostCombinations, lostBuilds);
	}

	private void printInformationForCombination(FightInformation informationForCombination) {
		System.out.println("BUILD: " + informationForCombination.getMostValuableBuild());
		System.out.println("FOCUS: " + informationForCombination.getMostValuableFocusTarget());
		System.out.println("Helpful notes from won battles: " + informationForCombination.getNotesForWonCombinations());
		System.out
				.println("Helpful notes from lost battles: " + informationForCombination.getNotesForLostCombinations());
		System.out.println("Matches were lost with the following builds: "
				+ informationForCombination.getBuildsThatLostFights() + "\n\n");
	}

	private static void calculatePresence(Map<Class, Long> classCounts) {
		double sumOfClassCounts = classCounts.values().stream().mapToDouble(classCount -> classCount.doubleValue())
				.sum();

		classCounts.entrySet().stream().sorted(Map.Entry.<Class, Long>comparingByValue().reversed()).forEach(entry -> {
			BigDecimal averagePerClass = new BigDecimal(entry.getValue() / sumOfClassCounts)
					.round(new MathContext(3, RoundingMode.HALF_UP));
			System.out.println(entry.getKey() + " = " + averagePerClass.doubleValue() * 100 + "%");
		});
		;
	}

	static Set<Talent> getMostValuableTalents(Collection<Build> buildsPlayedOnWonFights) {
		if (!buildsPlayedOnWonFights.isEmpty()) {
			return Collections
					.max(buildsPlayedOnWonFights.stream().collect(groupingBy(Build::getBuild, counting())).entrySet(),
							(entry1, entry2) -> Long.compare(entry1.getValue(), entry2.getValue()))
					.getKey();
		}
		return Collections.emptySet();
	}

	static Class getMostValuableFocusTarget(Collection<Fight> fightsToEvaluate) {
		if (!fightsToEvaluate.isEmpty()) {
			return Collections
					.max(fightsToEvaluate.stream().collect(groupingBy(Function.identity(), counting())).entrySet(),
							(entry1, entry2) -> Long.compare(entry1.getValue(), entry2.getValue()))
					.getKey().getFocus();
		}
		return Class.NONE;
	}

	static Collection<Fight> retrieveWonFights(Collection<Fight> fightsToEvaluate) {
		return fightsToEvaluate.stream().filter(fight -> fight.getResult().equals(Result.WIN)).collect(toList());
	}

	static Collection<Fight> retrieveLostFights(Collection<Fight> fightsToEvaluate) {
		return fightsToEvaluate.stream().filter(fight -> fight.getResult().equals(Result.DEFEAT)).collect(toList());
	}

	static Collection<String> retrieveNotesForCombinations(Collection<Fight> fightsForCombination) {
		return fightsForCombination.stream().filter(fight -> !fight.getNote().isEmpty()).map(fight -> fight.getNote())
				.distinct().collect(toList());
	}

	static Collection<Build> retrieveBuildsForCombinations(Collection<Fight> fightsForCombination) {
		return fightsForCombination.stream().map(fight -> fight.getBuild()).collect(toList());
	}

	static Collection<Build> retrieveDistinctBuildsForCombinations(Collection<Fight> fightsForCombination) {
		return fightsForCombination.stream().map(fight -> fight.getBuild()).filter(distinctByKey(Build::getBuild))
				.collect(toList());
	}

	static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> map = new ConcurrentHashMap<Object, Boolean>();
		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}
