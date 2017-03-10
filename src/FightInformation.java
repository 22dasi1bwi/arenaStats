import java.util.Collection;
import java.util.List;

public class FightInformation {

	private Collection<Collection<Talent>> buildsThatWonFight;

	private Collection<Talent> mostValuableBuild;

	private Class mostValuableFocusTarget;

	private Collection<String> notesForWonCombinations;

	private Collection<String> notesForLostCombinations;

	private List<Collection<Talent>> buildsThatLostFights;

	public FightInformation(Collection<Collection<Talent>> buildsThatWonFight, Collection<Talent> mostValuableBuild,
			Class mostValuableFocusTarget, Collection<String> notesForWonCombinations,
			Collection<String> notesForLostCombinations, List<Collection<Talent>> buildsThatLostFights) {
		this.buildsThatWonFight = buildsThatWonFight;
		this.mostValuableBuild = mostValuableBuild;
		this.mostValuableFocusTarget = mostValuableFocusTarget;
		this.notesForWonCombinations = notesForWonCombinations;
		this.notesForLostCombinations = notesForLostCombinations;
		this.buildsThatLostFights = buildsThatLostFights;
	}

	public Collection<Collection<Talent>> getBuildsThatWonFight() {
		return buildsThatWonFight;
	}

	public Collection<Talent> getMostValuableBuild() {
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

	public List<Collection<Talent>> getBuildsThatLostFights() {
		return buildsThatLostFights;
	}
}
