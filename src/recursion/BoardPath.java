package recursion;

import java.util.ArrayList;

public class BoardPath {
	public static void main(String[] arg) {
		System.out.println(getBoardPath(0, 10).size());
	}

	public static ArrayList<String> getBoardPath(int si, int target) {
		if (si == target) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}
		if (si > target)
			return new ArrayList<String>();

		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = getBoardPath(si + dice, target);

			for (String rrs : rr)
				mr.add(dice + rrs);
		}

		return mr;

	}

}
