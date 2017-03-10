package skill;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.Sets;

public class BuildUnitTest {

	@Test
	public void shouldReturnTrueForEqualBuilds() {
		Build build1 = new Build(Sets.newHashSet(Talent.BEACON_OF_FAITH, Talent.CRUSADER));
		Build build2 = new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BEACON_OF_FAITH));

		Assert.assertTrue(build1.equals(build2));
		Assert.assertTrue(build2.equals(build1));
	}

	@Test
	public void shouldReturnFalseForUnequalBuilds() {
		Build build1 = new Build(Sets.newHashSet(Talent.BEACON_OF_FAITH, Talent.DIVINE_FAVOR));
		Build build2 = new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BEACON_OF_FAITH));

		Assert.assertFalse(build1.equals(build2));
		Assert.assertFalse(build2.equals(build1));
	}

	@Test
	public void shouldReturnFalseForBuildThatIsASubsetOfAnother() {
		Build build1 = new Build(Sets.newHashSet(Talent.BEACON_OF_FAITH, Talent.CRUSADER));
		Build build2 = new Build(Sets.newHashSet(Talent.CRUSADER, Talent.BEACON_OF_FAITH, Talent.DIVINE_FAVOR));

		Assert.assertFalse(build1.equals(build2));
		Assert.assertFalse(build2.equals(build1));
	}
}
