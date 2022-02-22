package arrays;

public class LinearSearch {

	public int linearSearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item)
				return i;
		}
		return -1;
	}

}
