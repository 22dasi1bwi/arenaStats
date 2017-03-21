package statistic;

public class GeneralStatisticInformation {

	private long wins;

	private long defeats;

	private long totalPlayed;

	private double winRate;

	private double defeatRate;
	
	public GeneralStatisticInformation(long wins, long defeats, long totalPlayed, double winRate, double defeatRate){
		this.wins = wins;
		this.defeats = defeats;
		this.totalPlayed = totalPlayed;
		this.winRate = winRate;
		this.defeatRate = defeatRate;
	}

	public long getWins() {
		return wins;
	}

	public long getDefeats() {
		return defeats;
	}

	public long getTotalPlayed() {
		return totalPlayed;
	}

	public double getWinRate() {
		return winRate;
	}

	public double getDefeatRate() {
		return defeatRate;
	}
}
