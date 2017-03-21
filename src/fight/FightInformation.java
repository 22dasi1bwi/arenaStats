package fight;
import java.util.Collection;

import skill.Build;

public class FightInformation {
	
	private Collection<Build> buildsThatWonFight;

	private Build mostValuableBuild;

	private Class mostValuableFocusTarget;

	private Collection<String> notesForWonCombinations;

	private Collection<String> notesForLostCombinations;

	private Collection<Build> buildsThatLostFights;
	
	private long numberOfWonFights;
	
	private long numberOfLostfights;
	
	public FightInformation(Collection<Build> buildsThatWonFight, Build mostValuableBuild,
			Class mostValuableFocusTarget, Collection<String> notesForWonCombinations,
			Collection<String> notesForLostCombinations, Collection<Build> buildsThatLostFights, long numberOfWonFights, long numberOfLostFights) {
		this.buildsThatWonFight = buildsThatWonFight;
		this.mostValuableBuild = mostValuableBuild;
		this.mostValuableFocusTarget = mostValuableFocusTarget;
		this.notesForWonCombinations = notesForWonCombinations;
		this.notesForLostCombinations = notesForLostCombinations;
		this.buildsThatLostFights = buildsThatLostFights;
		this.numberOfWonFights = numberOfWonFights;
		this.numberOfLostfights = numberOfLostFights;
	}

	public Collection<Build> getBuildsThatWonFight() {
		return buildsThatWonFight;
	}

	public Build getMostValuableBuild() {
		return mostValuableBuild;
	}

	public Class getMostValuableFocusTarget() {
		return mostValuableFocusTarget;
	}

	public Collection<String> getNotesForWonCombinations() {
		return notesForWonCombinations;
	}

	public Collection<String> getNotesForLostCombinations() {
		return notesForLostCombinations;
	}

	public Collection<Build> getBuildsThatLostFights() {
		return buildsThatLostFights;
	}

	public long getNumberOfWonFights() {
		return numberOfWonFights;
	}

	public long getNumberOfLostfights() {
		return numberOfLostfights;
	}
	
	
}
