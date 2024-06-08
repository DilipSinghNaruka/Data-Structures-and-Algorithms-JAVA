class EvenOddCount{
	public static void main(String args []){
		int arr[] = {1,2,3,5,7,6,8};
		int size = arr.length;
		int even = 0;
		int odd = 0;
		for(int i = 0; i<size; i++){
			if(arr[i]%2==0){
				even++;	
			}else{
				odd++;
			}
		}
		System.out.println("Total Even Number is "+even);
		System.out.println("Total Odd Number is "+odd);
		
		

	}
}