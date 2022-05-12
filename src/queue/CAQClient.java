package queue;

public class CAQClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CircularArrayQueue caq = new CircularArrayQueue();

		caq.enqueue(10);
		caq.enqueue(20);
		caq.enqueue(30);
		caq.enqueue(40);
		caq.enqueue(50);

		caq.dequeue();
		caq.dequeue();
		caq.enqueue(1);
		caq.enqueue(2);

		while (!caq.isEmpty()) {
			System.out.println(caq.getFront());
			caq.dequeue();
		}

	}

}
