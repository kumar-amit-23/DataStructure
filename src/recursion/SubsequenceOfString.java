package recursion;

import java.util.ArrayList;

public class SubsequenceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSubsequenceASCII("ab"));
	}

	// return the array list which contains the subsequence of the string
	public static ArrayList<String> getSubsequence(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseList = new ArrayList<>();
			baseList.add("");
			return baseList;
		}
		char curr = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> recList = getSubsequence(ros);
		for (int i = 0; i < recList.size(); i++) {
			list.add(recList.get(i));
			list.add(curr + recList.get(i));
		}

		return list;
	}

//	return the array list which contains the subsequence of the string with ASCII value.
	public static ArrayList<String> getSubsequenceASCII(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseList = new ArrayList<>();
			baseList.add("");
			return baseList;
		}
		char curr = str.charAt(0);
		int currASCII = curr;
		String ros = str.substring(1);
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> recList = getSubsequenceASCII(ros);
		for (int i = 0; i < recList.size(); i++) {
			list.add(recList.get(i));
			list.add(curr + recList.get(i));
			list.add(currASCII + recList.get(i));
		}

		return list;
	}

}
