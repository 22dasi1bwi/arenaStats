import java.util.Collection;
import java.util.List;

public class FightInformation {

	private Collection<Collection<Talent>> buildsThatWonFight;

	private Collection<Talent> mostValueableBuild;

	private Class mostValueableFocusTarget;

	private Collection<String> notesForWonCombinations;

	private Collection<String> notesForLostCombinations;

	private List<Collection<Talent>> buildsThatLostFights;

	private Collection<Fight> fights;

	public FightInformation(Collection<Collection<Talent>> buildsThatWonFight, Collection<Talent> mostValueableBuild,
			Class mostValueableFocusTarget, Collection<String> notesForWonCombinations,
			Collection<String> notesForLostCombinations, List<Collection<Talent>> buildsThatLostFights,
			Collection<Fight> fights) {
		this.buildsThatWonFight = buildsThatWonFight;
		this.mostValueableBuild = mostValueableBuild;
		this.mostValueableFocusTarget = mostValueableFocusTarget;
		this.notesForWonCombinations = notesForWonCombinations;
		this.notesForLostCombinations = notesForLostCombinations;
		this.buildsThatLostFights = buildsThatLostFights;
		this.fights = fights;
	}

	public Collection<Collection<Talent>> getBuildsThatWonFight() {
		return buildsThatWonFight;
	}

	public Collection<Talent> getMostValueableBuild() {
		return mostValueableBuild;
	}

	public Class getMostValueableFocusTarget() {
		return mostValueableFocusTarget;
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

	public Collection<Fight> getFights() {
		return fights;
	}
}
