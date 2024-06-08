class MaxNum{
	public static void main(String args[]){
		int arr[] = {8,4,5,6,13};
		int size = 5;
		int maxi=-12312 ;
		for(int i = 0; i<size; i++){
			if(maxi<arr[i]){
				maxi = arr[i];
			}
		}
		System.out.println("Max Number in this Array:- "+maxi);
	}
}