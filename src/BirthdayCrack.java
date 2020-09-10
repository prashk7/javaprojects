public class BirthdayCrack {
	public String crackIt(String[] arr, int[] monthInNum, int targetMonthInNum) {

		if (arr.length == 0 || arr == null || monthInNum.length == 0)
			return "Input it correctly";

		int low = 0;
		int high = monthInNum.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (mid == targetMonthInNum) {
				return arr[mid];
			} else if (targetMonthInNum < mid)
				high = mid - 1;
			else
				low = mid + 1;

		}
		if (low == high)
			return arr[low];
		else
			return "Input it correctly";
	}

	public static void main(String[] args) {
		BirthdayCrack crack = new BirthdayCrack();

		String[] arr = { "Jan", "Feb", "March", "April", "May" };
		int[] monthInNum = { 0, 1, 2, 3, 4 };
		int targetMonthInNum = 4; // Input your month number 0 - Jan; 1-Feb; 2 - March and so on

		System.out.println("Tada your birthday month is " + crack.crackIt(arr, monthInNum, targetMonthInNum));
	}
}
