import java.util.Scanner;
class Diagonalsumarray
{
	
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array row length");
		int n = sc.nextInt();
		System.out.println("Enter array column length");
		int m = sc.nextInt();
        int[][] arr = new int[n][m];
		System.out.println("Enter array Values");
		for(int i = 0 ; i < arr.length; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				arr[i][j] = sc.nextInt();
			}

		}
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				if(i == j){
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println("sum of diagonals in the array is "+sum);



		
  }
}
