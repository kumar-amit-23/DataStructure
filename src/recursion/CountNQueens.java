package recursion;

public class CountNQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[][] board = new boolean[4][4];
		System.out.println(countNQueens(board, 0));

	}

	public static int countNQueens(boolean[][] boardpath, int row) {

		if (row == boardpath.length)
			return 1;

		int count = 0;
		for (int col = 0; col < boardpath[row].length; col++) {
			if (isItSafe(boardpath, row, col)) {
				boardpath[row][col] = true;
				count += countNQueens(boardpath, row + 1);
				boardpath[row][col] = false;
			}
		}

		return count;
	}

	private static boolean isItSafe(boolean[][] boardpath, int row, int col) {
		for (int i = row; i >= 0; i--) {
			if (boardpath[i][col])
				return false;
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (boardpath[i][j])
				return false;
		}

		for (int i = row, j = col; i >= 0 && j < boardpath[i].length; i--, j++) {
			if (boardpath[i][j])
				return false;
		}

		return true;
	}

}
