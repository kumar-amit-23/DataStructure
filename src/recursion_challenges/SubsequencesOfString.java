package recursion_challenges;

import java.util.ArrayList;

public class SubsequencesOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalSubsequencesofString("abcd"));
	}

	public static ArrayList<String> totalSubsequencesofString(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char curr = str.charAt(0);
		ArrayList<String> rr = totalSubsequencesofString(str.substring(1));
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < rr.size(); i++) {
			list.add(curr + rr.get(i));
			list.add(rr.get(i));

		}

		return list;
	}

}
