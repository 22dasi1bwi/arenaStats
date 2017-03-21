package statistic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Sets;

import fight.Class;
import fight.Combination;
import fight.Fight;
import fight.Result;
import skill.Build;
import skill.Talent;


public class StatisticUnitTest {
	
	private Statistic cut;

	@Before
	public void clearFights() {
		Fight.getAll().clear();
	}

	@Test
	public void shouldReturnOnlyWonFights() {
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), Class.WARRIOR_ARMS, Result.WIN,
				"Next time blessed hands");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.CRUSADER, Talent.FIST_OF_JUSTICE)), Class.PRIEST_DISCIPLINE,
				Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.PRIEST_DISCIPLINE,
				Result.DEFEAT, "");

		cut = new Statistic(Fight.getAll());

		Collection<Fight> wonFights = cut.retrieveWonFights(Fight.getAll());
		Assert.assertEquals(2, wonFights.size());
	}

	@Test
	public void shouldReturnOnlyLostFights() {
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.PRIEST_DISCIPLINE,
				Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.PRIEST_DISCIPLINE,
				Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.WARRIOR_ARMS,
				Result.WIN, "");

		cut = new Statistic(Fight.getAll());
		
		Collection<Fight> lostFights = cut.retrieveLostFights(Fight.getAll());
		Assert.assertEquals(2, lostFights.size());
	}

	@Test
	public void shouldReturnArmsAsMostValuableTarget() {
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.PRIEST_DISCIPLINE,
				Result.DEFEAT, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.WARRIOR_ARMS,
				Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.WARRIOR_ARMS,
				Result.WIN, "");

		cut = new Statistic(Fight.getAll());
		
		Class mostValuableFocusTarget = cut.getMostValuableFocusTarget(Fight.getAll());
		Assert.assertEquals(Class.WARRIOR_ARMS, mostValuableFocusTarget);
	}

	@Test
	public void shouldReturnNoneIfCollectionIsEmpty() {
		cut = new Statistic(Fight.getAll());
		
		Class mostValuableFocusTarget = cut.getMostValuableFocusTarget(Collections.emptyList());
		Assert.assertEquals(Class.NONE, mostValuableFocusTarget);
	}

	@Test
	public void shouldReturnDistinctNotesFromFights() {
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.PRIEST_DISCIPLINE,
				Result.WIN, "pressure on arms was good");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.WARRIOR_ARMS,
				Result.WIN, "pressure on arms was good");

		cut = new Statistic(Fight.getAll());
		
		Collection<String> notesForCombination = cut.retrieveNotesForCombinations(Fight.getAll());
		Assert.assertEquals(1, notesForCombination.size());
		Assert.assertTrue(notesForCombination.contains("pressure on arms was good"));
	}

	@Test
	public void shouldReturnTheMostValuableTalents() {
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.PRIEST_DISCIPLINE,
				Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.WARRIOR_ARMS,
				Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE, Talent.DIVINE_FAVOR)),
				Class.WARRIOR_ARMS, Result.WIN, "");

		cut = new Statistic(Fight.getAll());
		
		Set<Talent> mostValuableTalents = cut
				.getMostValuableTalents(Fight.getAll().stream().map(Fight::getBuild).collect(Collectors.toList()));
		Assert.assertEquals(2, mostValuableTalents.size());
		Assert.assertTrue(mostValuableTalents.containsAll(Arrays.asList(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)));
	}

	@Test
	public void shouldReturnEmptySetWhenThereAreNoFightsToEvaluate() {
		cut = new Statistic(Fight.getAll());
		
		Set<Talent> mostValuableTalents = cut.getMostValuableTalents(Collections.emptyList());
		Assert.assertTrue(mostValuableTalents.isEmpty());
	}

	@Test
	public void shouldReturnTheBuildsForTheGivenFights() {
		Build build1 = new Build(Sets.newHashSet(Talent.DIVINE_FAVOR, Talent.CRUSADER));
		Build build2 = new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE));

		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS), build1, Class.PRIEST_DISCIPLINE,
				Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS), build2, Class.WARRIOR_ARMS, Result.WIN,
				"");

		cut = new Statistic(Fight.getAll());
		
		Collection<Build> buildsForCombinations = cut.retrieveBuildsForCombinations(Fight.getAll());

		Assert.assertEquals(2, buildsForCombinations.size());
		Assert.assertTrue(buildsForCombinations.contains(build1));
		Assert.assertTrue(buildsForCombinations.contains(build2));
	}

	@Test
	public void shouldReturnArmsOnlyOnce() {
		Fight fight1 = new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.WARRIOR_ARMS,
				Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE)), Class.WARRIOR_ARMS,
				Result.WIN, "");
		Fight fight3 = new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS),
				new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE, Talent.DIVINE_FAVOR)),
				Class.PRIEST_DISCIPLINE, Result.WIN, "");

		cut = new Statistic(Fight.getAll());
		
		Predicate<Fight> distinctByKey = cut.distinctByKey(Fight::getFocus);
		List<Fight> distinctByFocusTarget = Fight.getAll().stream().filter(distinctByKey).collect(Collectors.toList());

		Assert.assertEquals(2, distinctByFocusTarget.size());
		Assert.assertTrue(distinctByFocusTarget.contains(fight1));
		Assert.assertTrue(distinctByFocusTarget.contains(fight3));
	}

	@Test
	public void shouldReturnTheDistinctBuildsForTheGivenFights() {
		Build build1 = new Build(Sets.newHashSet(Talent.DIVINE_FAVOR, Talent.CRUSADER));
		Build build2 = new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE));
		Build build3 = new Build(Sets.newHashSet(Talent.BLESSED_HANDS, Talent.FIST_OF_JUSTICE));

		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS), build1, Class.PRIEST_DISCIPLINE,
				Result.WIN, "");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS), build2, Class.WARRIOR_ARMS, Result.WIN,
				"");
		new Fight(new Combination(Class.PRIEST_DISCIPLINE, Class.WARRIOR_ARMS), build3, Class.WARRIOR_ARMS, Result.WIN,
				"");

		cut = new Statistic(Fight.getAll());
		
		Collection<Build> buildsForCombinations = cut.retrieveDistinctBuildsForCombinations(Fight.getAll());

		Assert.assertEquals(2, buildsForCombinations.size());
		Assert.assertTrue(buildsForCombinations.contains(build1));
		Assert.assertTrue(buildsForCombinations.contains(build2));
	}
}
