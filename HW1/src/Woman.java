public class Woman extends Person {
	int IDNumber;
	boolean isFree;
	Man ManRejectedByHer_1 = null;
	Man ManRejectedByHer_2 = null;
	Man ManRejectedByHer_3 = null;
	Man Hustband = null;

	public Woman(int BestOption, int AverageOption, int WorstOption,
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

	public boolean prefersHusbandOverGivenMan(Man man) {
		if (this.Hustband.IDNumber == man.IDNumber)
			return true;
		else if (this.getBestOption() == this.Hustband.IDNumber)
			return true;
		else if (this.getBestOption() == man.IDNumber)
			return false;
		else if (this.getAverageOption() == this.Hustband.IDNumber
				&& this.getAverageOption() != man.IDNumber)
			return true;
		else if (this.getAverageOption() != this.Hustband.IDNumber
				&& this.getAverageOption() == man.IDNumber)
			return false;
		else if (this.getWorstOption() == this.Hustband.IDNumber
				&& this.getWorstOption() != man.IDNumber)
			return false;
		else if (this.getWorstOption() != this.Hustband.IDNumber
				&& this.getWorstOption() == man.IDNumber)
			return true;
		else
			return true;
	}

	public String toStringOfHusband() {
		return "Husband of Woman Number " + this.IDNumber + " is ==> "
				+" Man Number " +this.Hustband.IDNumber;
	}

	public void reject(Man man) {
		if (ManRejectedByHer_1 != man || ManRejectedByHer_2 != man
				|| ManRejectedByHer_3 != man) {

			if (ManRejectedByHer_1 == null)
				ManRejectedByHer_1 = man;
			else if (ManRejectedByHer_2 == null)
				ManRejectedByHer_2 = man;
			else
				ManRejectedByHer_3 = man;
		}
	}
}
