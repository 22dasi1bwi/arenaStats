package sda.ArenaStatisticTracker.run;

import java.util.Arrays;

import sda.ArenaStatisticTracker.data.AsciiArtPrinter;
import sda.ArenaStatisticTracker.data.DataProvider;
import sda.ArenaStatisticTracker.fight.Combination;
import sda.ArenaStatisticTracker.fight.Fight;
import sda.ArenaStatisticTracker.fight.WoWClass;
import sda.ArenaStatisticTracker.statistic.Statistic;
import sda.ArenaStatisticTracker.statistic.StatisticPrinter;



public class Runner {

	public static void main(String[] args) {
		DataProvider.provideData();

		AsciiArtPrinter.draw();
		Statistic stats = new Statistic(Fight.getAll());
		Combination combination = new Combination(Arrays.asList(WoWClass.DEMONHUNTER_HAVOC, WoWClass.DRUID_RESTORATION, WoWClass.SHAMAN_ELEMENTAL));
		
		StatisticPrinter printer = new StatisticPrinter(stats, combination);
		printer.print();
	}
}
