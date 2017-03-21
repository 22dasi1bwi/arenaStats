package fight;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CombinationUnitTest {

	@Test
	public void shouldReturnTrueForEqualCombination() {
		Combination comb1 = new Combination(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION);
		Combination comb2 = new Combination(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION);

		Assert.assertTrue(comb1.equals(comb2));
		Assert.assertTrue(comb2.equals(comb1));
	}

	@Test
	public void shouldReturnTrueForEqualCombinationInWrongOrder() {
		Combination comb1 = new Combination(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION);
		Combination comb2 = new Combination(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC);

		Assert.assertTrue(comb1.equals(comb2));
		Assert.assertTrue(comb2.equals(comb1));
	}

	@Test
	public void shouldReturnFalseForUnequalCombination() {
		Combination comb1 = new Combination(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION);
		Combination comb2 = new Combination(Class.SHAMAN_ELEMENTAL, Class.DEMONHUNTER_HAVOC);

		Assert.assertFalse(comb1.equals(comb2));
		Assert.assertFalse(comb2.equals(comb1));
	}

	@Test
	public void shouldReturnTrueIfCombinationContainsFocusTarget() {
		Combination comb = new Combination(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION);
		Fight fight = new Fight(comb, null, Class.DEMONHUNTER_HAVOC, null, null);

		Assert.assertTrue(comb.containsClass(fight.getFocus()));
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void shouldReturnFalseIfCombinationDoesNotContainFocusTarget() {
		Combination comb = new Combination(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION);
		new Fight(comb, null, Class.SHAMAN_ELEMENTAL, null, null);
	}

}
