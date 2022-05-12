package stackImplementation;

public class Stack {

	protected int[] data;
	protected int top;

	Stack() {
		this(5);
	}

	Stack(int capacity) {
		this.data = new int[capacity];
		this.top = -1;
	}

	public int size() {
		return this.top + 1;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int value) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Stack is full");
		}

		this.top++;
		this.data[this.top] = value;
	}

	public int pop() throws Exception {
		if (this.isEmpty())
			throw new Exception("Stack is Empty");

		int rv = this.data[this.top];
		this.data[this.top] = 0;
		this.top--;

		return rv;

	}

	public int peek() throws Exception {
		if (this.isEmpty())
			throw new Exception("Stack is Empty");
		return this.data[this.top];

	}

	public void display() {
		System.out.println("---------------");
		for (int i = this.top; i >= 0; i--) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
		System.out.println("---------------");
	}

}
