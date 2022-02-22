package twoD_Array;

public class SprialPrint {

	public static void main(String[] arg) {
		int[][] arr = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 }, { 130, 140, 150, 160 } };
		spiralPrint(arr);
	}

	// to print the array in clockwise spiral
	public static void spiralPrint(int[][] arr) {
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[top].length - 1; 
		int dir = 1;
		int count = (bottom + 1) * (right + 1);

		while (left <= right && top <= bottom) {
			if(count > 0) {
				if(dir == 1) {
					for(int i = left; i<=right; i++) {
						System.out.print(arr[top][i] + " ");
						count--;
					}
					top++;
					dir = 2;
				}
			}
			if(count > 0) {
				if(dir == 2) {
					for(int i = top; i<=bottom; i++) {
						System.out.print(arr[i][right] + " ");
						count--;
					}
					right--;
					dir = 3;
				}
			}
			if(count > 0) {
				if(dir == 3) {
					for(int i = right; i>=left; i--) {
						System.out.print(arr[bottom][i] + " ");
						count--;
					}
					bottom--;
					dir = 4;
				}
			}
			if(count > 0) {
				if(dir == 4) {
					for(int i = bottom; i>=top; i--) {
						System.out.print(arr[i][left] + " ");
						count--;
					}
					left++;
					dir = 1;
				}
			}
		}
	}
}
