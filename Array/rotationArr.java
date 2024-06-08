class rotationArr{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};
		int size = 5;
		int i = 0;
		int j = size-1;
		// reverse array 
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			
		}
		// printing array 
		for(int k = 0; k<size; k++){
			System.out.print(arr[k]);
		}
		
		
	}
}