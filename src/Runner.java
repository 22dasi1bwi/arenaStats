public class Runner {

	public static void main(String[] args) {

		DataProvider.provideData();

		AsciiArtPrinter.draw();
		Statistic stats = new Statistic(Fight.getAll());

		// StatisticTEST stats = new StatisticTEST(Fight.getAll());
		System.out.println(stats.toString());
		DataProvider.printStatsForCombination();
	}
}
