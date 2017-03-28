package sda.ArenaStatisticTracker.statistic;

import java.util.Map;
import java.util.Optional;

import sda.ArenaStatisticTracker.fight.Combination;
import sda.ArenaStatisticTracker.fight.FightInformation;
import sda.ArenaStatisticTracker.fight.WoWClass;


public class StatisticPrinter {
	
	private Statistic stats;

	private Optional<Combination> combination;
	
	public StatisticPrinter(Statistic stats, Combination combination) {
		if(stats == null){
			throw new IllegalArgumentException("You have to provide information about your fights");
		}
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
		System.out.println("\n\nRetrieving matches for combination " + availableCombination.getClasses());
		
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
		Map<WoWClass, Double> overallClassOccurrence = stats.getOverallClassOccurrence();
		
		overallClassOccurrence.entrySet().stream()
										 .sorted(Map.Entry.<WoWClass, Double>comparingByValue().reversed())
										 .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + "%"));
	}
}

