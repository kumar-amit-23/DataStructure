package recursion_challenges;

import java.util.Scanner;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(convertToInteger(str, 0, 1, str.length() - 1));
		scn.close();
	}

	public static int convertToInteger(String str, int num, int multi, int idx) {
		if (idx < 0)
			return num;
		int ros = Integer.valueOf(str.substring(idx));
		String roq = str.substring(0, idx);
		num = ros * multi + num;
		int ans = convertToInteger(roq, num, multi * 10, idx - 1);

		return ans;
	}

}
