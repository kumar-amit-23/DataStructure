package timeComplexityQuestions;

import java.util.Arrays;

public class SOE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sieveOfEratosthenes(25);

	}

	public static void sieveOfEratosthenes(int n) {
		boolean[] arr = new boolean[n + 1];

		Arrays.fill(arr, true);
		arr[0] = arr[1] = false;

		for (int table = 2; table * table <= n; table++) {

			for (int multi = 2; multi * table <= n; multi++) {

				if (!arr[table * multi])
					continue;
				arr[table * multi] = false;
			}
		}

		for (int i = 0; i <= n; i++) {
			if (arr[i])
				System.out.println(i);
		}
	}

}
