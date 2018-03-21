import java.util.Arrays;
import java.util.Scanner;


public class Array {
	
	public void Excercise(){
		
		Scanner sc = new Scanner(System.in);
		final String abc [] = new String[2];
		int xyz[] = new int[2];
		
		for(int i=0; i<abc.length;i++){
			
			System.out.println("Enter the name of student");
			abc[i] = sc.next();
		}
		
		for(int j=0;j<xyz.length;j++){
			
			System.out.println("enter the numbers");
			xyz[j] = sc.nextInt();
		}
		
		sc.close();
		//changes hash code to String values,without this, it would only be se of hash values
		System.out.println(Arrays.toString(abc) + ";" + Arrays.toString(xyz));
	}
		
		
		
		
	public static void main(String[] args) {
			
		Array obj = new Array();
		obj.Excercise();
		
		
		System.out.println();
		
		System.out.println("hello");

	}

}
