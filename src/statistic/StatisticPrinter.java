package statistic;

import java.util.Map;
import java.util.Optional;

import fight.Class;
import fight.Combination;
import fight.FightInformation;

public class StatisticPrinter {
	
	private Statistic stats;

	private Optional<Combination> combination;
	
	public StatisticPrinter(Statistic stats, Combination combination ) {
		this.stats = stats;
		this.combination = Optional.ofNullable(combination);
	}
	
	public void print(){
		printGeneralStatisticInformation();
		if(combination.isPresent()){
			printStatisticForCombination();
		}
		printOverallClassOccurrence();
	}
	
	private void printGeneralStatisticInformation(){
		GeneralStatisticInformation generalStatisticInformation = stats.getGeneralStatisticInformation();
		System.out.println("TOTAL PLAYED: " + generalStatisticInformation.getTotalPlayed() + 
						   "\nWON: " + generalStatisticInformation.getWins() + 
						   "\nLOST: " + generalStatisticInformation.getDefeats() + 
						   "\nWIN-RATE: " + generalStatisticInformation.getWinRate() + 
						   "\nLOOSE-RATE: " + generalStatisticInformation.getDefeatRate());
	}

	private void printStatisticForCombination(){
		Combination availableCombination = combination.get();
		System.out.println("\n\nRetrieving matches for combination [" + availableCombination.getFirstClass() + " / "
				+ availableCombination.getSecondClass() + "] ...");
		
		FightInformation fightInformation = stats.getStatisticForCombination(availableCombination);
		
		System.out.println("WON: " + fightInformation.getNumberOfWonFights());
		System.out.println("LOST: " + fightInformation.getNumberOfLostfights());
		
		System.out.println("\n\nSearch for the most Valuable option ... \n");
		System.out.println("BUILD: " + fightInformation.getMostValuableBuild());
		System.out.println("FOCUS: " + fightInformation.getMostValuableFocusTarget());
		System.out.println("Helpful notes from won battles: " + fightInformation.getNotesForWonCombinations());
		System.out
				.println("Helpful notes from lost battles: " + fightInformation.getNotesForLostCombinations());
		System.out.println("Matches were lost with the following builds: "
				+ fightInformation.getBuildsThatLostFights());
	}
	
	private void printOverallClassOccurrence(){
		System.out.println("\n\nOVERALL CLASS PRESENCE:\n");
		Map<fight.Class, Double> overallClassOccurrence = stats.getOverallClassOccurrence();
		
		overallClassOccurrence.entrySet().stream()
										 .sorted(Map.Entry.<Class, Double>comparingByValue().reversed())
										 .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + "%"));
	}
}
