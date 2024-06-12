class StackArray{
	class Stack{
		int size;
		int []arr;
		int top;	
		
		Stack(int size){
			this.size = size;
			this.arr = new int[size];
			this.top = -1;
		}

		void push(int data){
			if(top>=size-1){
				System.out.print("Stack Overfull");
			}else{
				top++;
				arr[top] = data;
			}
					
		}
			
		void pop(){
			if(top<=0){
				System.out.print("Stack is Empty !");
			}
			top--;
		}

		boolean isEmpty(){
			if(top>=0){
				return false;
			}else{
				return true;
			}
		}

		void peek(){

			if(top>=0){
				System.out.print(arr[top]);
			}

			
		}
	}

	public static void main(String args[]){
		StackArray obj = new StackArray();
		Stack objS = obj.new Stack(5);
		objS.push(20);
		objS.push(30);
		objS.push(40);
		objS.pop();
		objS.pop();
		System.out.println(objS.isEmpty());
		objS.peek();
	}

	
}