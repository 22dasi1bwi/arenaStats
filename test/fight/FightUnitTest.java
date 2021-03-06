package fight;

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
		new Fight(new Combination(Arrays.asList(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION)), null, Class.SHAMAN_ELEMENTAL, null,
				null);
	}

	@Test
	public void shouldAddFightToList() {
		Fight fight1 = new Fight(new Combination(Arrays.asList(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION)), null,
				Class.DEMONHUNTER_HAVOC, null, null);

		Assert.assertEquals(1, Fight.getAll().size());
		Assert.assertTrue(Fight.getAll().contains(fight1));
	}
}
