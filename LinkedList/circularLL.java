class circularLL{
		Node tail = null;
		Node head = null;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	void addFirst(int data){
		Node newNode = new Node(data);
		if(head==null){
			newNode.next = head;
			head = newNode;
			tail = newNode;
			
		}else{
			newNode.next = head;
			head = newNode;
			tail.next = head;
		}		
		
	}

	void addLast(int data){
		Node newNode = new Node(data);
		if(head==null){
			newNode.next = head;
			head = newNode;
			tail = newNode;
			
		}else{
			newNode.next = head;
			tail.next = newNode;
			tail = newNode;
					}		
		
	}

	void addMiddle(int data, int key){
		Node newNode = new Node(data);
		if(head==null){
			newNode.next = head;
			head = newNode;
			tail = newNode;
		}
		Node temp = head;
		while(temp.data != key){
			temp = temp.next;
		}

		newNode.next = 	temp.next;
		temp.next = newNode;	
	}
		
	// deletion in this Cicrcular linkedlist 
	void delFirst(){
		if(head == null){
			System.out.println("Already Empty!");
		}
		
		head = head.next;
		tail.next = head;

	}

	void delLast(){
		if(head == null){
			System.out.println("Already Empty!");
		}
		Node temp = head;
		while(temp.next != tail){
			temp = temp.next;
			
		}
		
		temp.next = head;
		tail = temp;
	}

	void delMiddle(int key){
		if(head == null){
			System.out.println("Already Empty!");
		}
		
		Node temp = head;

		while(temp.data != key){
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	void printLL(){
		Node temp = head;
		do{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}while(temp != head);
	}
	public static void main(String args[]){
		circularLL obj = new circularLL();
		//obj.addFirst(10);
		//obj.addFirst(20);
		//obj.addLast(40);
		//obj.addMiddle(30,20);
		obj.addLast(10);
		obj.addLast(20);
		obj.addLast(40);
		obj.addMiddle(30,20);
		//obj.delFirst();
		//obj.delLast();
		obj.delMiddle(20);
		obj.printLL();

	}

}