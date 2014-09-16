import java.util.Scanner;

public class Algorithm {
	static int NumberOfManAndWoman = 3, i;
	static Man[] MenArray = new Man[NumberOfManAndWoman];
	static Woman[] WomenArray = new Woman[NumberOfManAndWoman];

	public static void main(String[] args) {
		Long StartTime, FinishTime;

		inputData();
		printGivenData();

		StartTime = System.nanoTime();

		while (getFreeMan() != null) {
			Man M = getFreeMan();
			Woman W = getWomanWhoHasNotRejectedHim(M);
			if (W.isFree()) {
				W.Hustband = M;
				M.setFree(false);
				W.setFree(false);
			} else {
				if (W.prefersHusbandOverGivenMan(M) == false) {
					W.Hustband.setFree(true);
					W.Hustband = M;
					M.setFree(false);
				} else {
					W.reject(M);
				}
			}
		}

		FinishTime = System.nanoTime();
		printResult();

		System.out.println("RunTime In Nano Seconds: "
				+ (FinishTime - StartTime));
		System.out.println("RunTime In Seconds: "
				+ (double) (FinishTime - StartTime) / 1000000000.0);
	}

	public static int InputInteger() {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);
		while (true) {
			try {
				return Integer.parseInt(stdin.next());
			} catch (NumberFormatException e) {
				System.out.println("Wrong Input Format !!!");
			}
		}
	}

	public static Man getFreeMan() {
		if (MenArray[0].isFree())
			return MenArray[0];
		else if (MenArray[1].isFree())
			return MenArray[1];
		else if (MenArray[2].isFree())
			return MenArray[2];
		else
			return null;
	}

	public static Woman getWomanWhoHasNotRejectedHim(Man man) {
		if (WomenArray[0].ManRejectedByHer_1 == null
				|| WomenArray[0].ManRejectedByHer_2 == null
				|| WomenArray[0].ManRejectedByHer_3 == null)
			return WomenArray[0];
		else if (WomenArray[1].ManRejectedByHer_1 == null
				|| WomenArray[1].ManRejectedByHer_2 == null
				|| WomenArray[1].ManRejectedByHer_3 == null)
			return WomenArray[1];
		else if (WomenArray[2].ManRejectedByHer_1 == null
				|| WomenArray[2].ManRejectedByHer_2 == null
				|| WomenArray[2].ManRejectedByHer_3 == null)
			return WomenArray[2];

		else if (WomenArray[0].ManRejectedByHer_1 != man
				|| WomenArray[0].ManRejectedByHer_2 != man
				|| WomenArray[0].ManRejectedByHer_3 != man)
			return WomenArray[0];

		else if (WomenArray[1].ManRejectedByHer_1 != man
				|| WomenArray[1].ManRejectedByHer_2 != man
				|| WomenArray[1].ManRejectedByHer_3 != man)
			return WomenArray[1];
		else if (WomenArray[2].ManRejectedByHer_1 != man
				|| WomenArray[2].ManRejectedByHer_2 != man
				|| WomenArray[2].ManRejectedByHer_3 != man)
			return WomenArray[2];
		else
			return null;
	}

	public static void printResult() {
		for (i = 0; i < NumberOfManAndWoman; i++) {
			System.out.println(WomenArray[i].toStringOfHusband());
		}
	}

	public static void printGivenData() {
		for (i = 0; i < NumberOfManAndWoman; i++) {
			System.out.println("Preference of Man Number " + i + " "
					+ MenArray[i].toString());
		}
		for (i = 0; i < NumberOfManAndWoman; i++) {
			System.out.println("Preference of Woman Number " + i + " "
					+ WomenArray[i].toString());
		}
	}

	public static void inputData() {
		for (i = 0; i < NumberOfManAndWoman; i++) {
			System.out.println("Enter Preference of Man Number " + (i + 1)
					+ " Highest To Lowest Preference ==>");
			MenArray[i] = new Man(InputInteger() + 1, InputInteger() + 1,
					InputInteger() + 1, i + 1, true);
			System.out.println("Enter Preference of Woman Number " + (i + 1)
					+ " Highest To Lowest Preference ==>");
			WomenArray[i] = new Woman(InputInteger() + 1, InputInteger() + 1,
					InputInteger() + 1, i + 1, true);
		}
	}
}
