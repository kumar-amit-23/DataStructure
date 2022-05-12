import java.util.StringTokenizer;

public class string {
	static String returnString(String s) {
		
		String regex = "[!._,'@? ]&";
		String input = s;
		
		String temp = "";
		
		StringTokenizer str = new StringTokenizer(input,regex);
	      while(str.hasMoreTokens()) {
//	         System.out.println(str.nextToken());
	         temp = temp + str.nextToken() + " ";
	      }

		String[] arr = temp.split(" ");

		int length = Integer.MIN_VALUE;
		String LongestWord = "";
		String token = "qu2nvxpfh6d1";

		for (String word : arr) {
			if (word.length() > length) {
				length = word.length();
				LongestWord = word;
			}
		}
//		System.out.println(LongestWord);
		String ActualWord = LongestWord + token;
		StringBuilder result = new StringBuilder(ActualWord);

		int n = 4;

		for (int i = n - 1; i < ActualWord.length(); i += n) {
			result.setCharAt(i, '_');

		}

		return result.toString();

	}

	static String getSequences(String str) {
		int n = str.length();
		String word = "";

		for (int i = 0; i < n; i++) {
			int count = 1;

			while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			word = word + count + str.charAt(i);
		}

		System.out.println(word);
		String token = "qu2nvxpfh6d1";
//		return word;
		

		String ActualWord = word + token;
		StringBuilder result = new StringBuilder(ActualWord);
		int x = 4;

		for (int i = x - 1; i < ActualWord.length(); i += x) {
			result.setCharAt(i, '_');

		}

		return result.toString();
	}

	public static void main(String[] args) {
		String word = "I love dogs&&&&";
//		String word = "aabbcde";
		System.out.println(returnString(word));
//		System.out.println(getSequences(word));
	}
}
