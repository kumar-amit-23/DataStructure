package recursion_challenges;

public class SubsteSumEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isSubsetSumZero(int[] arr, int idx) {
		if (idx == arr.length - 1)
			return false;

		int num = arr[idx];
		for (int i = idx + 1; i < arr.length; i++) {
			if (num + arr[i] == 0)
				return true;
		}

		return isSubsetSumZero(arr, idx + 1);
	}

}
