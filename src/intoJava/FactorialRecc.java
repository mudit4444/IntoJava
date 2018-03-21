package intoJava;

public class FactorialRecc {

	public int Fact(int n){
		
		if(n==0){
			return 1;
		}
		else{
			return (n*Fact(n-1));
		}
	}
	public static void main(String[] args) {
		
		FactorialRecc obj = new FactorialRecc();
		int factorial;
		
		factorial = obj.Fact(5);
		
		System.out.println("Factorial is "+factorial);
	}

}
