import java.util.Scanner;
class ArrayPrimesum
{
	public static boolean prime(int n){
		int count = 0;
		for(int i = 2 ; i <= n/2 ; i++){
			if(n%2 == 0){
				count++;
			}
		}
		if(count == 0){
			return true;
		}
		return false;
	}
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
		int sum = 0;
		System.out.println("Array prime sum ");
		for(int i = 0 ; i < arr.length ; i++){
			if(prime(arr[i])){
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
		
  }
}
