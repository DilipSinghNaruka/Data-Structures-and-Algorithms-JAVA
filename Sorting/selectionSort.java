class selectionSort{
	public static void main(String args[]){
		System.out.println("jai shree ram");
		int arr[] = {1,2,4,6,5,3};
		int size =  arr.length;

		for(int i = 0; i<size-1; i++){
			for(int j =i+1; j<size; j++ ){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}

		for(int k = 0;k<size;k++){
			System.out.print(arr[k]);
		}
	}

}