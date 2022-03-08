package recursion_challenges;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;

		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr, mid + 1, hi);

		int[] merge = mergeTwoArray(fh, sh);

		return merge;
	}

	public static int[] mergeTwoArray(int[] arr, int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] result = new int[arr.length + arr2.length];
		while (i < arr.length && j < arr2.length) {
			if (arr[i] < arr2[j]) {
				result[k++] = arr[i++];
			} else if (arr2[j] < arr[i]) {
				result[k++] = arr2[j++];
			} else {
				result[k++] = arr[i++];
			}
		}

		while (i < arr.length) {
			result[k++] = arr[i++];
		}

		while (j < arr2.length) {
			result[k++] = arr2[j++];
		}

		return result;

	}

}
