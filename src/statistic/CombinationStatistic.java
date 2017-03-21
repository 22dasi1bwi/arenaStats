package statistic;

import java.util.Collection;

import fight.Fight;

public class CombinationStatistic {
	
	private Collection<Fight> wonFights;
	
	private Collection<Fight> lostFights;

	public CombinationStatistic(Collection<Fight> wonFights, Collection<Fight> lostFights) {
		this.wonFights = wonFights;
		this.lostFights = lostFights;
	}

	public Collection<Fight> getWonFights() {
		return wonFights;
	}

	public Collection<Fight> getLostFights() {
		return lostFights;
	}
}
