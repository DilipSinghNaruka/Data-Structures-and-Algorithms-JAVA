class linearSearch{
	public static void main(String args[]){
		int arr[] = {1,3,2,5,4,7,6,9,8};
		int size = arr.length;
		int key = 5;
		for(int i = 0; i<size; i++){
			if(arr[i]==key){
				System.out.println("key position is "+(i+1));
			}
		}
		
			
	}
	
}