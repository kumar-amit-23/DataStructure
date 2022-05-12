package queueChallenges;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxElementinEveryWindowofSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = { 10, 50, 40, 80, 90, 40, 50, 70 };
		int k = scn.nextInt();
		maxElementinKwindowSize(arr, k);
		scn.close();

	}

	private static void maxElementinKwindowSize(int[] arr, int k) {
		// TODO Auto-generated method stub
		Deque<Integer> queue = new LinkedList<>();
		int i;
		for (i = 0; i < k; i++) {
			while (!queue.isEmpty() && arr[i] > arr[queue.getLast()]) {
				queue.removeLast();
			}
			queue.addLast(i);
		}

		for (; i < arr.length; i++) {
			System.out.print(arr[queue.getFirst()] + " ");
			while (!queue.isEmpty() && queue.getFirst() <= i - k)
				queue.removeFirst();

			while (!queue.isEmpty() && arr[i] > arr[queue.getLast()]) {
				queue.removeLast();
			}

			queue.addLast(i);
		}
		System.out.println(arr[queue.getFirst()]);

	}

}
