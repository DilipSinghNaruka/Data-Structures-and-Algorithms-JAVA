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
			top++;
			arr[top] = data;		
		}

		void peek(){
			System.out.print(arr[top]);
		}
	}

	public static void main(String args[]){
		StackArray obj = new StackArray();
		Stack objS = obj.new Stack(5);
		objS.push(20);
		objS.peek();
	}

	
}