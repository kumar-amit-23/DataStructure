package linkedListImplementation;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.display();

		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.display();

		ll.addFirst(5);
		ll.addFirst(1);
		ll.display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getAt(5));
//		System.out.println(ll.getAt(7));
		ll.AddNodeAt(4, 15);
		ll.display();
		System.out.println(ll.removeFirst());
		ll.display();
		System.out.println(ll.removeLast());
		ll.display();
		System.out.println(ll.removeAt(3));
		ll.display();
		System.out.println("mid ->" + ll.getMid());
		ll.display();

//		ll.reverseData();
//		ll.display();
//		ll.reversePointers();
//		System.out.println("reversed");
//		ll.display();
//		ll.addLast(100);
		// ll.removeLast();
		ll.addFirst(1);
		ll.display();

		System.out.println("mid ->" + ll.getMid());
		ll.removeFirst();
		ll.removeLast();
		ll.display();
		System.out.println("mid ->" + ll.getMid());
		System.out.println("-------------------------");
		ll.display();
		System.out.println(ll.getKthNodeFromeEnd(3));

	}

}
