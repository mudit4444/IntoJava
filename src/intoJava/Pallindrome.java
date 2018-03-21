package intoJava;

import java.util.Scanner;

public class Pallindrome {

	// Warning: Printing unwanted or ill-formatted data to output will cause the
	// test cases to fail

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int n = s.nextInt();

		String[] str = new String[n];
		String[] rev = new String[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Pallindrome String");
		
		for(int i = 0; i< n; i++) {
		str[i] = sc.nextLine();
		}

		for(int i =0 ; i<n; i++) {
		int length = str[i].length();
		

		for (int j = length - 1; j >= 0; i--) {
			while(j!=0) {
				rev[j] = rev[j] + str[i].charAt(j);
			}
		}
			
		}
		
		if(!str[i].equals(rev[j])) {
			System.out.println("NO");
		}
		else if ((str.equals(rev) && (str.length() % 2) == 0) ) {
				System.out.println("YES " + "EVEN");
			} else if((str.equals(rev) && (str.length() % 2) != 0))
				System.out.println("YES " + "ODD");
	}}