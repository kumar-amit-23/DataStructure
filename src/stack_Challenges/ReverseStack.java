package stack_Challenges;

import java.util.Stack;

public class ReverseStack {

	// reverse the original stack with the help of another stack
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		for (int i = 1; i <= 5; i++)
			stack.push(i * 10);

		Stack<Integer> helper = new Stack<>();
		for (int num : stack)
			System.out.print(num + " ");
		System.out.println();
		System.out.println("------------------");
		reverseStack(stack, helper, 0);
		for (int num : stack)
			System.out.print(num + " ");

	}

	private static void reverseStack(Stack<Integer> stack, Stack<Integer> helper, int indx) {
		// TODO Auto-generated method stub
		if (stack.isEmpty())
			return;
		int val = stack.pop();
		reverseStack(stack, helper, indx + 1);
		helper.push(val);
		if (indx == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}

	}

}
