package stackImplementation;

public class DynamicStack extends Stack {

	DynamicStack() {
		this(5);
	}

	DynamicStack(int capacity) {
		this.data = new int[capacity];
		this.top = -1;
	}

	public void push(int value) throws Exception {
		if (this.size() == this.data.length) {
			int[] arr = new int[this.data.length * 2];
			for (int i = 0; i < this.size(); i++)
				arr[i] = this.data[i];

			this.data = arr;
		}

		super.push(value);
	}
}
