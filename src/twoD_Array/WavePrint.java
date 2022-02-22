package twoD_Array;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		wavePrint(arr);
	}

	// to print the vale of array row wise.
	public static void wavePrint(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[row].length; col++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {
				for (int col = arr[row].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + " ");
				}
			}
			System.out.println();
		}
	}
}
