package queue;

public class CircularArrayQueue {

	private int[] data;
	private int front;
	private int rear;
	private int count;

	public CircularArrayQueue() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public CircularArrayQueue(int capacity) {
		this.data = new int[capacity];
		this.front = 0;
		this.rear = 0;
		this.count = 0;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == this.data.length;
	}

	public void enqueue(int value) throws Exception {
		if (isFull())
			throw new Exception("Queue is full");
		this.data[this.rear] = value;
		this.rear = (this.rear + 1) % this.data.length;
		this.count++;
	}

	public int dequeue() throws Exception {
		if (isEmpty())
			throw new Exception("Queue is empty");

		int value = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		this.count--;

		return value;

	}

	public int getFront() {
		return this.data[this.front];
	}

}
