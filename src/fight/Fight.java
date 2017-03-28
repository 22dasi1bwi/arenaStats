package fight;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import skill.Build;

@Entity
@NamedQueries({ @NamedQuery(name = "Fight.findAll", query = "SELECT * FROM Fight") })
public class Fight {

    @Id
    @GeneratedValue
    private long id;

    private Combination combination;

    private Build build;

    private Class focus;

    private Result result;

    private String note;

    private static final ArrayList<Fight> ALL = new ArrayList<>();

    public Fight(Combination combination, Build build, Class focus, Result result, String note) {
        this.combination = combination;
        this.build = build;
        this.focus = focus;
        this.result = result;
        this.note = note;

        if (!combination.getClasses().contains(focus)) {
            throw new IllegalArgumentException(
                    "You cannot specify a focus target which is not contained in the combination you are actually facing!");
        }

        ALL.add(this);
    }

    public Combination getCombination() {
        return combination;
    }

    public Build getBuild() {
        return build;
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
        return " with Build: " + getBuild() + " and focus on: " + getFocus() + " lead to: " + result + ". (NOTE: " + getNote() + ")";
    }
}
