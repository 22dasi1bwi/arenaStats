package sda.ArenaStatisticTracker.fight;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sda.ArenaStatisticTracker.build.Build;


@Entity
@NamedQueries({ @NamedQuery(name = "Fight.findAll", query = "SELECT f FROM Fight f") })
@Table(name = "FIGHT")
public class Fight implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "FIGHT_ID", nullable = false)
    @GeneratedValue
    private long id;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "fight", cascade = CascadeType.ALL)
    private Combination combination;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "fight", cascade = CascadeType.ALL)
    private Build build;

    private WoWClass focus;

    private Result result;

    private String note;

    private static final ArrayList<Fight> ALL = new ArrayList<>();
    
    public Fight(){
    	
    }

    public Fight(Combination combination, Build build, WoWClass focus, Result result, String note) {
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
    
    public long getId(){
    	return id;
    }

    public Combination getCombination() {
        return combination;
    }

    public Build getBuild() {
        return build;
    }

    public WoWClass getFocus() {
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

