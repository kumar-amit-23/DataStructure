package arrays;

public class SelectionSort {
	public void selectionSort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int j = counter + 1; j < arr.length; j++) {
				if (arr[min] > arr[j])
					min = j;
			}

			if (min != counter) {
				int temp = arr[min];
				arr[min] = arr[counter];
				arr[counter] = temp;
			}
		}
	}
}
