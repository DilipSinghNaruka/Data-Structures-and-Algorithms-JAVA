class singlyLinkedList {
	Node head = null;

	class Node {
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// here are methods of adding nodes

	void AddFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = null;
		}

		newNode.next = head;
		head = newNode;

	}

	void AddLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}

		currNode.next = newNode;

	}

	void AddMiddle(int data, int key) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		}

		Node currNode = head;
		while (currNode.data != key) {
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;

	}

	// here method are deleting nodes
	void dltFirst() {
		head = head.next;

	}

	void dltLast() {
		Node currNode = head;
		while (currNode.next.next != null) {
			currNode = currNode.next;
		}
		currNode.next = null;
	}

	void dltMiddle(int key) {
		Node currNode = head;
		while (currNode.next.data == key) {
			currNode.next = currNode.next.next;
		}
	}

	void printLL() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
	}

	public static void main(String args[]) {
		singlyLinkedList obj = new singlyLinkedList();
		// obj.AddFirst(30);
		// obj.AddFirst(20);
		// obj.AddFirst(10);
		// obj.AddLast(60);
		// obj.AddLast(70);
		// obj.AddMiddle(40,30);
		// obj.dltFirst();
		// obj.dltLast();
		// obj.dltLast();
		// obj.dltLast();
		// obj.AddFirst(10);
		// obj.dltMiddle(20);

		obj.AddFirst(10);
		obj.printLL();
	}

}