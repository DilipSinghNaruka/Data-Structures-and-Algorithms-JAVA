class reverseStackArray{
	class stackReverse{
		int[] arr;
		int top;
		int size;

		stackReverse(int size){
			this.size = size;
			arr = new int[size];
			top = -1;
		}
		
		void push(int data){
			if(top > size-1){
				System.out.print("Stack is full !..");
			}
			top++;
			arr[top] = data;
		}
		boolean isEmpty(){
			if(top<=-1){
				return true;
			}else{
				return false;
			}
		}

		void peek(){
			if(isEmpty()){
				System.out.print("stack is empty");
			}
			System.out.print(arr[top]+", ");
		}
		
		void pop(){
			if(isEmpty()){
				System.out.print("stack is empty");
			}
			top--;
			return;
		}

		void reverse(){
			for(int i = 0; i<size; i++){
				peek();	
				pop();		
			}
		}
		
		
	}

	public static void main(String args[]){
		reverseStackArray objM = new reverseStackArray();
		stackReverse obj = objM.new stackReverse(5);
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		//obj.pop();
		obj.reverse();
		//obj.peek();

	}
}