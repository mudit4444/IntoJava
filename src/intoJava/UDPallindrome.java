package intoJava;

import java.util.Scanner;

public class UDPallindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] str = new String[10];
		
		System.out.println("Enter the number of test cases");
		int test = sc.nextInt();
		String rev = "";
		System.out.println("Enter the string to be checked");
		
		for(int i = 0; i<= test; i++) {
			str[i] = sc.nextLine();
		}
		
		for(int j = 0; j<= test; j++) {
			
			for(int i =str[j].length()-1; i>=0 ; i--) {
				
				rev = rev + str[j].charAt(i);
			}
			//System.out.println(rev);
		}
		
		for(int j = 0; j<= test; j++) {
			if(str[j].equalsIgnoreCase(rev)) {
				System.out.println(str[j] + "is a Pallindrome");
			}
			else {
			System.out.println(str[j] + "is not a pallindrome");
			}
			
			//rev = "";
		}
		
		

	}
}
