package fight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Combination {

	private List<Class> classes;
	
	private static final int [] validCombinationSize = {2, 3, 5};
	
	public Combination(List<Class> classes){
		this.classes = classes;
		validateCombination();
	}
	
	private void validateCombination(){
		if(!isValidCombinationSize())
			throw new IllegalArgumentException("You have entered an invalid combination size. Valid values are: " + Arrays.toString(validCombinationSize));
	}
	

	private boolean isValidCombinationSize(){
		return IntStream.of(validCombinationSize).anyMatch(validSize -> validSize == classes.size());
	}
	
	public List<Class> getClasses(){
		return classes;
	}
	
}
