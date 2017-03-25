package fight;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CombinationUnitTest {

	@Test
	public void shouldReturnTrueForEqualCombination() {
		Combination comb1 = new Combination(Arrays.asList(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION));
		Combination comb2 = new Combination(Arrays.asList(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION));

		Assert.assertTrue(comb1.getClasses().containsAll(comb2.getClasses()));
		Assert.assertTrue(comb2.getClasses().containsAll(comb1.getClasses()));
	}

	@Test
	public void shouldReturnTrueForEqualCombinationInWrongOrder() {
		Combination comb1 = new Combination(Arrays.asList(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION));
		Combination comb2 = new Combination(Arrays.asList(Class.DRUID_RESTORATION, Class.DEMONHUNTER_HAVOC));

		Assert.assertTrue(comb1.getClasses().containsAll(comb2.getClasses()));
		Assert.assertTrue(comb2.getClasses().containsAll(comb1.getClasses()));
	}

	@Test
	public void shouldReturnFalseForUnequalCombination() {
		Combination comb1 = new Combination(Arrays.asList(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION));
		Combination comb2 = new Combination(Arrays.asList(Class.SHAMAN_ELEMENTAL, Class.DEMONHUNTER_HAVOC));

		Assert.assertFalse(comb1.equals(comb2));
		Assert.assertFalse(comb2.equals(comb1));
	}

	@Test
	public void shouldReturnTrueIfCombinationContainsFocusTarget() {
		Combination comb = new Combination(Arrays.asList(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION));
		Fight fight = new Fight(comb, null, Class.DEMONHUNTER_HAVOC, null, null);

		Assert.assertTrue(comb.getClasses().contains(fight.getFocus()));
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void shouldReturnFalseIfCombinationDoesNotContainFocusTarget() {
		Combination comb = new Combination(Arrays.asList(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION));
		new Fight(comb, null, Class.SHAMAN_ELEMENTAL, null, null);
	}

}
