package recursion;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 40, 22, 12, 24, 50, 100, 1130, 2, 1, 6 };
		quickSort(arr, 0, arr.length - 1);
		for (int val : arr)
			System.out.print(val + " ");

	}

	public static void quickSort(int[] arr, int lo, int hi) {

		if (lo >= hi)
			return;

		int mid = (lo + hi) / 2;
		int pivot = arr[mid];

		int left = lo;
		int right = hi;

		while (left <= right) {
			while (arr[left] < pivot)
				left++;

			while (arr[right] > pivot)
				right--;

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		quickSort(arr, lo, right);
		quickSort(arr, left, hi);
	}

}
