import java.util.Collection;

public class CombinationStat {

	private Collection<Fight> wonFightsForCombination;

	private Collection<Fight> lostFightsForCombination;

	public CombinationStat(Collection<Fight> wonFightsForCombination, Collection<Fight> lostFightsForCombination) {
		this.wonFightsForCombination = wonFightsForCombination;
		this.lostFightsForCombination = lostFightsForCombination;
	}

	public Collection<Fight> getWonFightsForCombination() {
		return wonFightsForCombination;
	}

	public Collection<Fight> getLostFightsForCombination() {
		return lostFightsForCombination;
	}
}
