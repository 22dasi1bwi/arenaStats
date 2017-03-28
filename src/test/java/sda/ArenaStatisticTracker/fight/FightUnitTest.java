package sda.ArenaStatisticTracker.fight;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FightUnitTest {

	@BeforeMethod
	public void clearFights() {
		Fight.getAll().clear();
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void shouldThrowExceptionDueToFocusIsNotContainedInCombination() {
		new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION)), null, WoWClass.SHAMAN_ELEMENTAL, null,
				null);
	}

	@Test
	public void shouldAddFightToList() {
		Fight fight1 = new Fight(new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION)), null,
				WoWClass.DEMONHUNTER_HAVOC, null, null);

		Assert.assertEquals(1, Fight.getAll().size());
		Assert.assertTrue(Fight.getAll().contains(fight1));
	}
}
