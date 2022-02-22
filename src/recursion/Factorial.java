package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFactorial(4));
	}

	public static int findFactorial(int n) {
		if (n == 1)
			return n;

		int fact = n * findFactorial(n - 1);
		return fact;
	}

}
