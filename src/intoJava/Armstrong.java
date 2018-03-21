package intoJava;
public class Armstrong {
	public static void main(String[] args) {
		int num =153;
		int sum=0;
		int temp;
		temp = num;
		
		while(num!=0){
		
		
		int a = num%10;
		
		sum = sum+(a*a*a);
		
		num=num/10;
		}
		
		if(temp == sum){
			System.out.println("Pallin");
		}
		else{
			System.out.println("Not a Pallin");
		}
		

	}

}
