package recursion;

import java.util.ArrayList;

public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPermutation("abc"));

	}

	// return the list with all the permutation of string.
	public static ArrayList<String> getPermutation(String str) {

		if (str.length() == 0) {
			ArrayList<String> myResult = new ArrayList<>();
			myResult.add("");
			return myResult;
		}
		char curr = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recurResult = getPermutation(ros);
		ArrayList<String> myResult = new ArrayList<>();

		for (String s : recurResult) {
			for (int i = 0; i <= s.length(); i++) {
				String sa = s.substring(0, i) + curr + s.substring(i);
				myResult.add(sa);
			}
		}

		return myResult;
	}

}
