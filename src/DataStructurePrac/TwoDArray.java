package DataStructurePrac;

import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows");
		int n = sc.nextInt();
		
		System.out.println("Number of columns");
		int m = sc.nextInt();
		
		int [][] arr = new int[n][m];
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<m ; j++) {
				System.out.println("Enter the value in an array ");
			arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix is as below ");
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<m ; j++) {
				
			System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println("Matrix after transpose");
		for(int i = 0; i<m ; i++) {
			for(int j = 0; j <n ; j++) {
				System.out.print(arr[j][i]);
			}
			System.out.println(" ");
		}
		
	}

}
