package stackImplementation;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Stack stack = new Stack();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		stack.push(50);
//		stack.display();
//		stack.push(10);
//		System.out.println(stack.pop());
//		stack.display();
		
		
		DynamicStack stack = new DynamicStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();

	}

}
