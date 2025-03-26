import java.util.Scanner;
class Arraydescending
{
	
	public static void main(String[] args) 
	{ 
		int[][] arr = {{100,120,57},{97,100,121},{70,40,50}};

		int[] arr1 = new int[arr.length];
		for(int i = 0 ; i < arr.length ; i++){
			int max = arr[i][0];
			for(int j = 0; j < arr[i].length ; j++){
				if(arr[i][j] > max){
					max = arr[i][j];
				}
			}
            arr1[i] = max;
		}
		for(int val : arr1){
			System.out.print(val +" ");
		}
  }
}
