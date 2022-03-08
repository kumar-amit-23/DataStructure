package recursion_challenges;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void quickSort(int[] arr, int lo, int hi) {
		if(lo >= hi)
			return;
		
		int mid = (lo + hi)/ 2;
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
