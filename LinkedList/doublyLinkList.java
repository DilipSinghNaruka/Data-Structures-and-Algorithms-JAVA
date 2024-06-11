class doublyLinkList {
	Node head = null;

	class Node {
		private int data;
		private Node pre;
		private Node next;

		Node(int data) {
			this.data = data;
			this.pre = null;
			this.next = null;
		}
	}

	// Adding node
	void addFirst(int data) {
		Node newNode = new Node(data);
		if (head != null) {
			head.pre = newNode;
			newNode.next = head;
		}

		head = newNode;

	}

	void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		newNode.pre = currNode;
		currNode.next = newNode;

	}

	void addMiddle(int data, int key) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		}
		Node currNode = head;
		while (currNode.data != key) {
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		newNode.pre = currNode;
		currNode.next = newNode;

	}

// deletion 
	void dltFirst(){
		head = head.next;
		
	}

	void dltEnd(){
		
		Node currNode = head;

		if(head == null){
			System.out.println("Node is empty !");
		}

		while(currNode.next != null){
			currNode = currNode.next;
		}
		currNode.pre.next = null;
	}

	void dltMiddle(int key){
		Node currNode = head;
		
		while(currNode.data == key){
			currNode = currNode.next;
		}
		currNode.next.pre = currNode;
		currNode.next = currNode.next.next;
		
	}

	// printLL
	void printLL() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
	}

	public static void main(String args[]) {
		doublyLinkList obj = new doublyLinkList();
		obj.addFirst(30);
		obj.addFirst(20);
		obj.addFirst(10);
		obj.addLast(50);
		obj.addMiddle(40, 30);
		//obj.dltFirst();
		//obj.dltFirst();
		//obj.dltEnd();
		obj.dltMiddle(20);
		
		obj.printLL();

	}

}