class boobleSort{
	public static void main(String args[]){
		int arr[] = {1,4,6,2,5,3};
		int size = arr.length;
		for(int i = 0; i<size-1; i++){
			for(int j = 0; j<size-1-i; j++ ){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i<size; i++){
			System.out.print(arr[i]);
		}
	}

}