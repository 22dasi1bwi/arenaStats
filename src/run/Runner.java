package run;

import data.AsciiArtPrinter;
import data.DataProvider;
import fight.Class;
import fight.Combination;
import fight.Fight;
import statistic.Statistic;
import statistic.StatisticPrinter;

public class Runner {

	public static void main(String[] args) {
		DataProvider.provideData();

		AsciiArtPrinter.draw();
		Statistic stats = new Statistic(Fight.getAll());
		Combination combination = new Combination(Class.DEMONHUNTER_HAVOC, Class.DRUID_RESTORATION);
		
		StatisticPrinter printer = new StatisticPrinter(stats, combination);
		printer.print();
		
	}
	
}
