package recursion;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		int[] merge = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				merge[k] = arr1[i];
				i++;
				k++;
			} else {
				merge[k] = arr2[j];
				k++;
				j++;
			}
		}

		while (j < arr2.length) {
			merge[k] = arr2[j];
			k++;
			j++;
		}

		while (i < arr1.length) {
			merge[k] = arr1[i];
			k++;
			i++;
		}

		return merge;
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

		int[] merge = mergeTwoSortedArray(fh, sh);

		return merge;
	}

}
