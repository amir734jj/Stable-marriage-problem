public class Man extends Person {
	int IDNumber;
	boolean isFree;

	public Man(int BestOption, int AverageOption, int WorstOption,
			int IDNumber, boolean isFree) {
		super(BestOption, AverageOption, WorstOption);
		this.IDNumber = IDNumber;
		this.isFree = isFree;
	}

	public String toString() {
		return super.toString();
	}

	public int getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

}
