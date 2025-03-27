import java.util.Scanner;
class Stocksellbuy
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
 
         int[] arr1 = {12,-3,0,1,10,-4,11};
          int sell = 0;
		  int buy = 0;
		  int profit = 0;
		  for(int i = 0 ; i < arr.length ; i++){
			  for(int j = i+1 ; j < arr.length ; j++){
				  int diff = arr1[i] - arr1[j];
				  if(diff > profit){
                     profit = diff;
					 sell = arr1[i];
					 buy = arr[j];
				  }
			  }
		  }
		  System.out.println(sell + " " + buy);
		}
}
