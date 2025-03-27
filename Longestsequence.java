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
          
		int start = -1;
        int end = -1;
        int sp = -1;
        int ep = -1;
        int maxdiff = 0;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            start = i;
            end = i+1;
            while(end < arr.length && arr[start]+1 == arr[end]){
                start++;
                end++;
            }
            int diff = end - i;
            if(diff > maxdiff){
                maxdiff = diff;
                sp = i;
                ep = end-1;
            }
            
        }
        System.out.println("Longest subsequence start at index "+ sp +" and end at index "+ep);
		  
		}
}
