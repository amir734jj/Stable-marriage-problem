public class Person {
	int BestOption, AverageOption, WorstOption;

	public Person(int BestOption, int AverageOption, int WorstOption) {
		this.BestOption = BestOption;
		this.AverageOption = AverageOption;
		this.WorstOption = WorstOption;
	}

	public int getBestOption() {
		return BestOption;
	}

	public void setBestOption(int bestOption) {
		BestOption = bestOption;
	}

	public int getAverageOption() {
		return AverageOption;
	}

	public void setAverageOption(int averageOption) {
		AverageOption = averageOption;
	}

	public int getWorstOption() {
		return WorstOption;
	}

	public void setWorstOption(int worstOption) {
		WorstOption = worstOption;
	}

	public String toString() {
		return "[ BestOption: " + getBestOption() + " AverageOption: "
				+ getAverageOption() + " WorstOption: " + getWorstOption()
				+ " ]";
	}

}
