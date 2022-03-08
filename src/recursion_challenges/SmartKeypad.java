package recursion_challenges;

import java.util.ArrayList;

public class SmartKeypad {
	static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(smartKeypad("12"));
	}

	public static ArrayList<String> smartKeypad(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> list = new ArrayList<>();
		int curr = str.charAt(0) - '0';
		String ros = str.substring(1);
		ArrayList<String> rr = smartKeypad(ros);

		String s = table[curr];
		for (int j = 0; j < s.length(); j++) {
			for (int i = 0; i < rr.size(); i++) {
				list.add(s.charAt(j) + rr.get(i));
			}
		}
		return list;
	}

}
