package run;
import data.AsciiArtPrinter;
import data.DataProvider;
import fight.Class;
import fight.Combination;
import fight.Fight;
import statistic.Statistic;

public class Runner {

	public static void main(String[] args) {

		DataProvider.provideData();

		AsciiArtPrinter.draw();
		Statistic stats = new Statistic(Fight.getAll());

		stats.printGeneralInformation();
		stats.printStatsForCombination(new Combination(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION));
		stats.printOverallClassPresence(stats.getAllFights());
	}
}
