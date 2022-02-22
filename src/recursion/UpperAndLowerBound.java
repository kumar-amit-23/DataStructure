package recursion;

public class UpperAndLowerBound {
	public static void main(String[] arg) {
		int[] arr = {10,20,20,20,20,40,50};
		System.out.println(upperBound(arr, 0, 20));
		System.out.println(lowerBound(arr, 0, 20));
	}

	public static int lowerBound(int[] arr, int si, int item) {
		if (si == arr.length)
			return -1;

		if (arr[si] == item) {
			return si;
		} else {
			int idx = lowerBound(arr, si + 1, item);
			return idx;
		}
	}

	public static int upperBound(int[] arr, int si, int item) {
		if (si == arr.length) {
			return -1;
		}
		int idx = upperBound(arr, si + 1, item);
		if (idx == -1) {
			if (arr[si] == item) {
				return si;
			} else {
				return -1;
			}
		}
		return idx; 
	}

}
