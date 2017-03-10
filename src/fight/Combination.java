package fight;

public class Combination {

	private Class firstClass;

	private Class secondClass;

	public Combination(Class firstClass, Class secondClass) {
		this.firstClass = firstClass;
		this.secondClass = secondClass;
	}

	public Class getFirstClass() {
		return firstClass;
	}

	public Class getSecondClass() {
		return secondClass;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		Combination combination = (Combination) obj;

		if (this.firstClass.equals(combination.firstClass) && this.secondClass.equals(combination.secondClass)
				|| this.firstClass.equals(combination.secondClass) && this.secondClass.equals(combination.firstClass)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return firstClass + " / " + secondClass;
	}
}
