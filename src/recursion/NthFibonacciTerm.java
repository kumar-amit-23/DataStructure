package recursion;

public class NthFibonacciTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthFibTerm(6));
		System.out.println(5/0);
	}

	public static int nthFibTerm(int n) {
		if (n == 0 || n == 1)
			return n;
		int ans = nthFibTerm(n - 1) + nthFibTerm(n - 2);
		return ans;
	}

}
