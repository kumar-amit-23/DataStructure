package recursion_challenges;

import java.util.Scanner;

public class FindLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		int M = scn.nextInt();
		System.out.println(lastOccurence(arr, n - 1, M));
		scn.close();
	}

	public static int lastOccurence(int[] arr, int idx, int target) {
		if (idx < 0)
			return -1;
		if (arr[idx] == target)
			return idx;
		int idxc = lastOccurence(arr, idx - 1, target);
		return idxc;
	}

}
