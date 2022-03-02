package recursion_challenges;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 22 };
		System.out.println(isSorted(arr, 0));
	}

	public static boolean isSorted(int[] arr, int curr) {

		if (curr == arr.length)
			return true;

		if (curr != 0 && arr[curr] < arr[curr - 1])
			return false;

		boolean flag = isSorted(arr, curr + 1);
		return flag;
	}

}
