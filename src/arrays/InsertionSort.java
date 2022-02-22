package arrays;

public class InsertionSort {
	public void insertionSort(int[] arr) {
		for (int counter = 1; counter < arr.length; counter++) {
			int val = arr[counter];

			int j = counter - 1;

			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = val;
		}
	}
}
