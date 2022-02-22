package recursion;

public class PrintDecreasingIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDI(5);
	}

	// print 5 4 3 2 1 1 2 3 4 5 on the console.
	public static void PDI(int n) {
		if (n == 0)
			return;

		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

}
