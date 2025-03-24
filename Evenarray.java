import java.util.Scanner;
class Oddarray
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
		System.out.println("Even values are");
		for(int i = 0 ; i < n ; i++){
			if(arr[i] % 2 == 1){
				System.out.print(arr[i] + " ");
			}
		}
  }
}
