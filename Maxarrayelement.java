import java.util.Scanner;
class Minarrayelement
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
		int min = arr[0];
		for(int i = 0 ; i < n ; i++){
             if(arr[i] < min){
				 min = arr[i];
			 }
		}
		System.out.println("Max element is "+min);
		
  }
}
