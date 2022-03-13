package linkedListImplementation;

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private int size;
	private Node head;
	private Node tail;

	public void display() {
		Node temp = this.head;
		System.out.println("----------------------");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("----------------------");
	}

	public void addLast(int value) {
		// create a new node
		Node nn = new Node();
		nn.data = value;
		nn.next = null;

		// attach the linked list
		if (this.size >= 1) {
			this.tail.next = nn;
		}

		// updating the variables of linked list
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.tail = nn;
			this.size++;
		}
	}

	public void addFirst(int value) {

		// create a new node
		Node nn = new Node();
		nn.data = value;
		nn.next = null;

		// attach the linked list
		if (this.size >= 1) {
			nn.next = head;
		}

		// updating the variables of linked list - summary object
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			this.head = nn;
			this.size++;
		}

	}

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is empty");
		}

		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {
		if (this.size == 0)
			throw new Exception("LL is empty");

		if (idx < 0 || idx >= this.size) {
			throw new Exception("idx out of range");
		}

		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	private Node getNodeAt(int idx) throws Exception {
		if (this.size == 0)
			throw new Exception("LL is empty");

		if (idx < 0 || idx >= this.size) {
			throw new Exception("idx out of range");
		}

		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void AddNodeAt(int idx, int value) throws Exception {
		if (idx == 0) {
			addFirst(value);
		} else if (idx == this.size) {
			addLast(value);
		} else {
			Node nn = new Node();
			nn.data = value;

			Node nm1 = getNodeAt(idx - 1);
			Node np1 = nm1.next;

			nm1.next = nn;
			nn.next = np1;

			// summary object
			this.size++;
		}
	}

	public int removeFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("LL is empty");

		int rv = this.head.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}

		return rv;
	}

	public int removeLast() throws Exception {
		if (this.size == 0)
			throw new Exception("LL is empty");

		int rv = this.tail.data;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.tail = getNodeAt(this.size - 2);
			this.tail.next = null;
			this.size--;
		}

		return rv;
	}

	public int removeAt(int idx) throws Exception {
		if (this.size == 0)
			throw new Exception("LL is empty");

		if (idx < 0 || idx >= this.size) {
			throw new Exception("idx out of range");
		}

		if (idx == 0) {
			return removeFirst();
		} else if (idx == this.size - 1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;
			nm1.next = np1;
			this.size--;

			return n.data;
		}

	}

	public void reverseData() throws Exception {
		int left = 0;
		int right = this.size - 1;

		while (left < right) {
			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);

			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;
		}
	}

	public void reversePointers() {
		Node prev = null;
		Node curr = this.head;
		Node ahead = curr.next;

		while (ahead != null) {
			curr.next = prev;
			prev = curr;
			curr = ahead;
			ahead = ahead.next;

		}

		curr.next = prev;
		this.tail = this.head;
		this.head = curr;
	}

	// without using size and in one traverse
	public int getMid() {
		Node mid = this.head;
		Node fast = this.head;

		while (fast != null && fast.next != null) {
			mid = mid.next;
			fast = fast.next.next;
		}
		return mid.data;
	}

	public int getKthNodeFromeEnd(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("idx out of range");
		}

		Node slow = this.head;
		Node fast = this.head;

		for (int i = 1; i <= k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}

}
