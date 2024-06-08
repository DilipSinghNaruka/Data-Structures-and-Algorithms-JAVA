class MinNum{
	public static void main(String args []){
		int arr[] = {-3,5,1,5,-6};
		int size = 5;
		int mini = 94948;
		for(int i = 0; i<size; i++){
			if(arr[i]<mini){
				mini = arr[i];
			}
		}
		System.out.println("Minimum Number of array is : "+ mini);
	}
}