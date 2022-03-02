package recursion_challenges;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(removeDuplicates(str, 1, str.charAt(0) + ""));
		scn.close();
	}

	public static String removeDuplicates(String str, int idx, String ans) {
		if (idx > str.length() - 1)
			return ans;

		if (str.charAt(idx) != str.charAt(idx - 1)) {
			ans += str.charAt(idx);
		}

		return removeDuplicates(str, idx + 1, ans);
	}

}
