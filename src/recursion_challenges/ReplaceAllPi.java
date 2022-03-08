package recursion_challenges;

public class ReplaceAllPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xpipippixx";
		System.out.println(replaceAllPi(str, str.charAt(0) + "", 1));
	}

	public static String replaceAllPi(String str, String ans, int idx) {
		if (idx == str.length())
			return ans;

		if (str.charAt(idx) == 'i' && str.charAt(idx - 1) == 'p') {
			ans = ans.substring(0, ans.length() - 1) + "3.14";
		}else {
			ans += str.charAt(idx);
		}
		
		String result = replaceAllPi(str, ans, idx+1);
		return result;
	}

}
