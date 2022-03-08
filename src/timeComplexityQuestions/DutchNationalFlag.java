package timeComplexityQuestions;

// sort an array 0f 0, 1, 2 in O(N) time and space complexity of O(1)
public class DutchNationalFlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 1, 1, 0, 2, 0, 2, 1 };
		int[] result = sortArray(arr);
		for (int num : result)
			System.out.print(num + " ");

	}

	public static int[] sortArray(int[] arr) {

		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				int temp = arr[low]; // if 0 swap low and mid and increment both
				arr[low++] = arr[mid];
				arr[mid++] = temp;
			} else if (arr[mid] == 1) {
				mid++; // increment mid if 1
			} else {
				int temp = arr[mid]; // if 2 swap mid and high and decrement high.
				arr[mid] = arr[high];
				arr[high--] = temp;
			}
		}
		return arr;
	}

}
