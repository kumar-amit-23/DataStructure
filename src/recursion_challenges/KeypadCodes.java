package recursion_challenges;

public class KeypadCodes {
	static String table[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printKeypadCombination("12", "");
		System.out.println();
		System.out.println(countKeypadCombination("12"));

	}

	public static void printKeypadCombination(String str, String ans) {

		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		String curr = table[str.charAt(0) - '0'];
		String ros = str.substring(1);
		for (int i = 0; i < curr.length(); i++) {
			printKeypadCombination(ros, ans + curr.charAt(i));
		}
	}

	public static int countKeypadCombination(String str) {
		if (str.length() == 0) {
			return 1;
		}

		int ans = 0;

		String curr = table[str.charAt(0) - '0'];
		String ros = str.substring(1);
		for (int i = 0; i < curr.length(); i++) {
			ans += countKeypadCombination(ros);
		}

		return ans;
	}

}
