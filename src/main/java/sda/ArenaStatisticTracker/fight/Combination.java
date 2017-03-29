package sda.ArenaStatisticTracker.fight;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "COMBINATION")
public class Combination implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "COMBINATION_ID", nullable = false)
    private long id;

    @Column
    @Enumerated
    @ElementCollection(targetClass = WoWClass.class)
    private List<WoWClass> wowClasses;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Fight fight;

    private static final int[] validCombinationSize = { 2, 3, 5 };

    public Combination() {

    }

    public Combination(List<WoWClass> wowClasses) {
        this.wowClasses = wowClasses;
        validateCombination();
    }

    private void validateCombination() {
        if (!isValidCombinationSize())
            throw new IllegalArgumentException(
                    "You have entered an invalid combination size. Valid values are: " + Arrays.toString(validCombinationSize));
    }

    private boolean isValidCombinationSize() {
        return IntStream.of(validCombinationSize).anyMatch(validSize -> validSize == wowClasses.size());
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (!this.getClass().equals(other.getClass())) {
            return false;
        }

        if (this == other) {
            return true;
        }

        Combination combination = (Combination) other;

        if (this.getWowClasses().size() == combination.getWowClasses().size()
                && this.getWowClasses().containsAll(combination.getWowClasses())) {
            return true;
        }

        return false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<WoWClass> getWowClasses() {
        return wowClasses;
    }

    public void setWowClasses(List<WoWClass> wowClasses) {
        this.wowClasses = wowClasses;
    }

    public Fight getFight() {
        return fight;
    }

    public void setFight(Fight fight) {
        this.fight = fight;
    }

}
