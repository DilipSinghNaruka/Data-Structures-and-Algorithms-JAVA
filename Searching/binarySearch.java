class binarySearch{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int key = 5;
		int start = 0;	
		int end = arr.length;	
		int mid = start+end/2;
		while(start<=end){
			if(arr[mid]==key){
				System.out.println(mid);
				break;
			}else if(arr[mid]>key){
				end = mid;
			}else{
				start  = mid;
			}
			mid = start+end/2;

		}
		

	}
}