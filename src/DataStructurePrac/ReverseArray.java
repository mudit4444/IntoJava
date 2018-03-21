package DataStructurePrac;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int n = sc.nextInt();
		
		
		int [] arr = new int[n];
		//int rev[] = new int[n];
		
		System.out.println("elements in array");
		for(int i = 0 ; i<=n-1; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j = n-1 ; j>=0 ; j--) {
		System.out.println(arr[j]);
		}
	}
}
