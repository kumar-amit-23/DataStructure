package recursion_challenges;

import java.util.Scanner;

public class AllIndicesProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		int M = scn.nextInt();
		int[] ans = getAllIndices(arr, 0, M, 0);
		for (int num : ans)
			System.out.print(num + " ");
		scn.close();

	}

	public static int[] getAllIndices(int[] arr, int idx, int target, int count) {

		if (idx > arr.length - 1) {
			int[] br = new int[count];
			return br;
		}
		if (arr[idx] == target) {
			count++;
		}
		int[] result = getAllIndices(arr, idx + 1, target, count);
		if (arr[idx] == target) {
			result[count - 1] = idx;
		}

		return result;

	}

}
