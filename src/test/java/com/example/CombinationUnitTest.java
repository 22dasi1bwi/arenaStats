package com.example;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by SDA on 07.04.2017.
 */
public class CombinationUnitTest {

    @Test(expected = IllegalArgumentException.class)
    public void hasInvalidCombinationSize(){
        new Combination(Arrays.asList(WoWClass.DEATHKNIGHT));
    }

    @Test
    public void shouldReturnTrueDueToSameObject(){
        Combination combination = new Combination(Arrays.asList(WoWClass.DEATHKNIGHT, WoWClass.DEMONHUNTER));

        assertThat(combination.equals(combination)).isTrue();
    }

    @Test
    public void shouldReturnFalseDueToDifferentTypes(){
        Combination combination = new Combination(Arrays.asList(WoWClass.DEATHKNIGHT, WoWClass.DEMONHUNTER));

        assertThat(combination.equals(new Object())).isFalse();
    }

    @Test
    public void shouldReturnFalseDueToNull(){
        Combination combination = new Combination(Arrays.asList(WoWClass.DEATHKNIGHT, WoWClass.DEMONHUNTER));

        assertThat(combination.equals(null)).isFalse();
    }

    @Test
    public void shouldReturnFalseDueToDifferentSize(){
        Combination combination = new Combination(Arrays.asList(WoWClass.DEATHKNIGHT, WoWClass.DEMONHUNTER));
        Combination combination2 = new Combination(Arrays.asList(WoWClass.DEMONHUNTER, WoWClass.DRUID, WoWClass.HUNTER));

        assertThat(combination.equals(combination2)).isFalse();
    }

    @Test
    public void shouldReturnFalseDueToDifferentWoWClasses(){
        Combination combination = new Combination(Arrays.asList(WoWClass.DEATHKNIGHT, WoWClass.DEMONHUNTER));
        Combination combination2 = new Combination(Arrays.asList(WoWClass.DEMONHUNTER, WoWClass.DRUID));

        assertThat(combination.equals(combination2)).isFalse();
    }

    @Test
    public void shouldReturnTrueDueToSameWoWClassesInSameOrder(){
        Combination combination = new Combination(Arrays.asList(WoWClass.DEATHKNIGHT, WoWClass.DEMONHUNTER));
        Combination combination2 = new Combination(Arrays.asList(WoWClass.DEATHKNIGHT, WoWClass.DEMONHUNTER));

        assertThat(combination.equals(combination2)).isTrue();
    }

    @Test
    public void shouldReturnTrueDueToSameWoWClassesInDifferentOrder(){
        Combination combination = new Combination(Arrays.asList(WoWClass.DEATHKNIGHT, WoWClass.DEMONHUNTER));
        Combination combination2 = new Combination(Arrays.asList(WoWClass.DEMONHUNTER, WoWClass.DEATHKNIGHT));

        assertThat(combination.equals(combination2)).isTrue();
    }
}
