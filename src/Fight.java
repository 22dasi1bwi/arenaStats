import java.util.ArrayList;
import java.util.Collection;

public class Fight {

	private Combination combination;

	private Collection<Talent> talents;

	private Class focus;

	private Result result;

	private String note;

	private static final ArrayList<Fight> ALL = new ArrayList<>();

	public Fight(Combination combination, Collection<Talent> talents, Class focus, Result result, String note) {
		this.combination = combination;
		this.talents = talents;
		this.focus = focus;
		this.result = result;
		this.note = note;

		ALL.add(this);
	}

	public Combination getCombination() {
		return combination;
	}

	public Collection<Talent> getTalents() {
		return talents;
	}

	public Class getFocus() {
		return focus;
	}

	public Result getResult() {
		return result;
	}

	public String getNote() {
		return note;
	}

	public static ArrayList<Fight> getAll() {
		return ALL;
	}

	@Override
	public String toString() {
		return " with Build: " + getTalents() + " and focus on: " + getFocus() + " lead to: " + result + ". (NOTE: "
				+ getNote() + ")";
	}
}
