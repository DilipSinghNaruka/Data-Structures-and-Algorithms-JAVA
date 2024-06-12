class StackLL{
	Node head;
	class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	void push(int data){
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
		}
		
		newNode.next = head;
		head = newNode;
	}

	void pop(){
		if(head == null){
			System.out.print("Stack is empty!");
		}else{
			head = head.next;
		}
	}

	void peek(){
		System.out.print(head.data);
	}
	public static void main(String agrs[]){
		StackLL obj = new StackLL();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.pop();
		obj.pop();
		obj.peek();
	}
}