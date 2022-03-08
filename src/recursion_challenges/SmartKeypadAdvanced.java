package recursion_challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartKeypadAdvanced {

	static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	static String[] searchIn = { "kartik", "sneha", "deepak", "arnav", "shikha", "palak", "utkarsh", "divyam", "vidhi",
			"sparsh", "akku" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> list = getList(str);
		System.out.println(search(list));
		scn.close();

	}

	public static ArrayList<String> search(ArrayList<String> strList) {
		ArrayList<String> ans = new ArrayList<>();
		for (int i = 0; i < searchIn.length; i++) {
			for (int j = 0; i < strList.size(); j++) {
				if (searchIn[i].contains(strList.get(j)))
					ans.add(searchIn[i]);
			}
		}

		return ans;
	}

	public static ArrayList<String> getList(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		ArrayList<String> list = new ArrayList<>();
		int curr = str.charAt(0) - '0';
		String ros = str.substring(1);
		ArrayList<String> rr = getList(ros);

		String s = table[curr];
		for (int j = 0; j < s.length(); j++) {
			for (int i = 0; i < rr.size(); i++) {
				list.add(s.charAt(j) + rr.get(i));
			}
		}
		return list;
	}

}
