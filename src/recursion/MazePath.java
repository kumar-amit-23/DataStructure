package recursion;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMazePath(0, 0, 2, 2));
		System.out.println(getMazePathDiagonal(0, 0, 2, 2));

	}
	/*
	 * find number of ways to reach (2,2) from (0,0) with one horizontal or vertical
	 * move.
	 */

	private static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}

		if (cr > er || cc > ec) {
			return new ArrayList<String>();
		}

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = getMazePath(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}

		ArrayList<String> rrv = getMazePath(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		return mr;
	}

	public static ArrayList<String> getMazePathDiagonal(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}

		if (cr > er || cc > ec) {
			return new ArrayList<String>();
		}

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = getMazePathDiagonal(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}

		ArrayList<String> rrd = getMazePathDiagonal(cr + 1, cc + 1, er, ec);
		for (String rrds : rrd) {
			mr.add("D" + rrds);
		}

		ArrayList<String> rrv = getMazePathDiagonal(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		return mr;
	}
}
