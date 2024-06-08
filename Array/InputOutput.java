import java.util.Scanner;
class InputOutput{
	public static void main(String args[]){
		int size = 5;
		System.out.println("JAI SHREE RAM");
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[size];
		for(int i = 0; i<size; i++){
			System.out.print("take input in "+(i+1)+" ");
			arr[i] = sc.nextInt();			
		}
		for(int i = 0; i<size; i++){
			System.out.print(arr[i]+" ");
		}
	}

}