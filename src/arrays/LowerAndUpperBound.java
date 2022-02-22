package arrays;

public class LowerAndUpperBound {
	public int getLowerBound(int[] arr, int item) {
		int ans = -1;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > item) {
				high = mid - 1;
			} else if (arr[mid] < item) {
				low = mid + 1;
			} else {
				ans = mid;
				high = mid - 1;
			}
		}
		return ans;
	}

	public int getUpperBound(int[] arr, int item) {
		int ans = -1;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] > item) {
				high = mid - 1;
			} else if (arr[mid] < item) {
				low = mid + 1;
			} else {
				ans = mid;
				low = mid + 1;
			}
		}
		return ans;
	}
}
