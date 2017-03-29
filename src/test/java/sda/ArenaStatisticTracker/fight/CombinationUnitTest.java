package sda.ArenaStatisticTracker.fight;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CombinationUnitTest {

    @Test
    public void shouldReturnTrueForEqualCombination() {
        Combination comb1 = new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION));
        Combination comb2 = new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION));

        Assert.assertTrue(comb1.equals(comb2));
        Assert.assertTrue(comb2.equals(comb1));
    }

    @Test
    public void shouldReturnTrueForEqualCombinationInWrongOrder() {
        Combination comb1 = new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION));
        Combination comb2 = new Combination(Arrays.asList(WoWClass.DRUID_RESTORATION, WoWClass.DEMONHUNTER_HAVOC));

        Assert.assertTrue(comb1.equals(comb2));
        Assert.assertTrue(comb2.equals(comb1));
    }

    @Test
    public void shouldReturnFalseForUnequalCombination() {
        Combination comb1 = new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION));
        Combination comb2 = new Combination(Arrays.asList(WoWClass.SHAMAN_ELEMENTAL, WoWClass.DEMONHUNTER_HAVOC));

        Assert.assertFalse(comb1.equals(comb2));
        Assert.assertFalse(comb2.equals(comb1));
    }

    @Test
    public void shouldReturnFalseOnEqualsNull() {
        Combination comb = new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION));

        Assert.assertFalse(comb.equals(null));
    }

    @Test
    public void shouldReturnFalseOnEqualsDifferentClasses() {
        Combination comb = new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION));

        Assert.assertFalse(comb.equals(new Object()));
    }

    @Test
    public void shouldReturnFalseForDifferentCombinationSize() {
        Combination comb1 = new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION));
        Combination comb2 = new Combination(
                Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION, WoWClass.WARLOCK_AFFLICTION));
        Combination comb3 = new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION,
                WoWClass.WARLOCK_AFFLICTION, WoWClass.PALADIN_HOLY, WoWClass.SHAMAN_ELEMENTAL));

        Assert.assertFalse(comb1.equals(comb2));
        Assert.assertFalse(comb2.equals(comb1));
        Assert.assertFalse(comb1.equals(comb3));
        Assert.assertFalse(comb3.equals(comb1));
        Assert.assertFalse(comb3.equals(comb2));
        Assert.assertFalse(comb2.equals(comb3));
    }

    @Test
    public void shouldReturnTrueIfCombinationContainsFocusTarget() {
        Combination comb = new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION));
        Fight fight = new Fight(comb, null, WoWClass.DEMONHUNTER_HAVOC, null, null);

        Assert.assertTrue(comb.getWowClasses().contains(fight.getFocus()));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldReturnThrowExceptionIfCombinationDoesNotContainFocusTarget() {
        Combination comb = new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION));
        new Fight(comb, null, WoWClass.SHAMAN_ELEMENTAL, null, null);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowExceptionIfTheCombinationIsInvalidInSize() {
        Combination comb = new Combination(Arrays.asList(WoWClass.DEATHKNIGHT_BLOOD));
        new Fight(comb, null, WoWClass.DEATHKNIGHT_BLOOD, null, null);
    }
}
