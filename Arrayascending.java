import java.util.Scanner;
class Arraydescending
{
	
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
	    
		int[] arr = new int[n];
		System.out.println("Enter array values");
		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextInt();
        }
		
		for(int i = 0 ; i < n ; i++){
             for(int j = 0 ; j < n - 1 - i ; j++){
				 if(arr[j] < arr[j+1]){
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
			 }
		}

		System.out.println("Array after ascending");
		for(int val : arr){
			System.out.print(val+" ");
		}
  }
}
