package stack_Challenges;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 5, 2, 6, 4, 8 };
		findNextGreaterElement(arr);

	}

	private static void findNextGreaterElement(int[] arr) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[i] > stack.peek()) {
				System.out.println(stack.pop() + " -> " + arr[i]);
			}

			stack.push(arr[i]);
		}

		while (!stack.isEmpty())
			System.out.println(stack.pop() + " -> " + "-1");

	}

}
