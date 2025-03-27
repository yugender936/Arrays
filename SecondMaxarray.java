import java.util.Scanner;
class Targetsumarray
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
 
        int target = 10;
		int[] b = new int[2];
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr.length - 1 ; j++){
				if(arr[i] + arr[j] == target){
                     b[0] = arr[i];
					 b[1] = arr[j];
				}
			}
			}

			System.out.println(b[0] + " "+b[1]);
		}


  
}
