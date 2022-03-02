package recursion_challenges;

import java.util.Scanner;

public class DuplicateCharacterFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
//		String str = scn.next();
		String str = "hello";
		if (str.length() == 0) {
			System.out.println(str);
		} else {
			System.out.println(formattedString(str, 1, str.charAt(0) + ""));
		}
		scn.close();

	}

	public static String formattedString(String str, int idx, String ans) {
		if (idx >= str.length())
			return ans;
		if (str.charAt(idx) == str.charAt(idx - 1)) {
			ans = ans + "*" + str.charAt(idx);
		} else {
			ans += str.charAt(idx);
		}
		return formattedString(str, idx + 1, ans);
	}

}
