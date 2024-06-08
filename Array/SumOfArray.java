class SumOfArray{
	public static void main(String args []){
		int size = 5;
		int arr[] = {4,5,6,7,8};
		int sum = 0;
		for(int i = 0; i<size; i++){
			sum += arr[i];
		} 
		System.out.println("This is sum of all Elements:- "+sum);
	}
}