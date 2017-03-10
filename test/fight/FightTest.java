package fight;

import org.junit.Assert;
import org.junit.Test;

public class FightTest {

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionDueToFocusIsNotContainedInCombination() {
		new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION), null, Class.SHAMAN_ELEMENTAL, null,
				null);
	}

	@Test
	public void shouldAddFightToList() {
		Fight fight1 = new Fight(new Combination(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION), null,
				Class.DEMONHUNTER_HAVOC, null, null);

		Assert.assertEquals(1, Fight.getAll().size());
		Assert.assertTrue(Fight.getAll().contains(fight1));
	}
}
