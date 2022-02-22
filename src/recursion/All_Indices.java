package recursion;

public class All_Indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 54, 2, 6, 2, 2, 2, 5, 6, 7 };
		displayArray(findAllIndices(arr, 0, 2, 0));

	}

	// to return the array with all the indexes where item occurred.
	public static int[] findAllIndices(int[] arr, int si, int item, int count) {
		if (si == arr.length) {
			int[] base = new int[count];
			return base;
		}
		int[] indices = null;
		if (arr[si] == item) {
			indices = findAllIndices(arr, si + 1, item, count + 1);
		} else {
			indices = findAllIndices(arr, si + 1, item, count);
		}

		if (arr[si] == item) {
			indices[count] = si;
		}
		return indices;

	}

	public static void displayArray(int[] arr) {
		for (int item : arr)
			System.out.print(item + ", ");
	}

}
