package arrays;

public class BinarySearch {

	// time complexity is O(logn).
	// Note :- array should be sorted.
	public int binarySearch(int[] arr, int item) {

		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] < item) {
				low = mid + 1;
			} else if (arr[mid] > item) {
				high = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}
