package intoJava;

import java.util.Scanner;

public class AddingArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		
		

		System.out.println("Enter the values of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("enter the elements in Second Array");
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
		}

		for (int j = 0; j < n; j++) {
			System.out.print( c[j] + " ");
		}

	}

}
