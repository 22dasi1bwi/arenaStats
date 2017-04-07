package com.example;

import lombok.*;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;

/**
 * Created by SDA on 07.04.2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Combination {

    private static int [] validSizeForCombination = {2, 3, 5};

    @Id
    @GeneratedValue
    private long id;

    @ElementCollection(targetClass = WoWClass.class)
    @Enumerated(EnumType.STRING)
    private Collection<WoWClass> woWClasses;

    @OneToOne(fetch = FetchType.EAGER)
    private Fight fight;

    public Combination (Collection<WoWClass> woWClasses){
        this.woWClasses = woWClasses;

        if(!isValidCombinationSize()){
            throw new IllegalArgumentException("You have entered an invalid combination size. Valid sizes are: " + Arrays.asList(validSizeForCombination));
        }
    }

    private boolean isValidCombinationSize(){
        return IntStream.of(validSizeForCombination).anyMatch(size -> size == woWClasses.size());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Combination that = (Combination) other;

        return this.woWClasses.size() == that.woWClasses.size() && this.woWClasses.containsAll(that.woWClasses);
    }

    @Override
    public int hashCode() {
        return woWClasses != null ? woWClasses.hashCode() : 0;
    }
}


