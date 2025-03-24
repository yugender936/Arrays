import java.util.Scanner;
class Powerwithindex
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
		System.out.println("value with power");
		int result = 0;
		for(int i = 0 ; i < n ; i++){
			int power = arr[i];
			for(int j = 1 ; j < i ; j++){
				if(i != 0){
				power = power*arr[i];
				}
			}
			result = result + power;
		}
		System.out.println(result);
  }
}
