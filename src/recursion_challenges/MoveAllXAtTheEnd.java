package recursion_challenges;

public class MoveAllXAtTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(moveX("axbxcxxx", 0));
	}
	
	public static String moveX(String str, int idx) {
		
		if(idx == str.length() - 1)
			return str;
		
		if(str.charAt(idx) == 'x') {
			str = str.substring(0, idx) + str.substring(idx+1) + 'x';
		}
		String ans = moveX(str, idx+1);
		return ans;
		
	}

}
