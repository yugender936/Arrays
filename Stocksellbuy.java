import java.util.Scanner;
class Longestsequence
{
	
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array length ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array values");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
          int start = 0;
		  int maxdiff = 0;
          while(start < arr.length){
			  int end = start+1;
             while(end < arr.length && arr[start] == arr[end]+1){
				 start++;
				 end++;
			 }
			 int diff = end-start;
			 if(diff > maxdiff){
				 maxdiff = diff;
			 }
			 start++;
		  }
		  System.out.println(start +" "+end);
		}
}
