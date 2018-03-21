
public class FibonacciUsingRecursion {

	static int f =0,s=1;
public static void fib(int count ) {
		
		
		if (count>0) {
			int fibo = f+s;
			f = s;
			s= fibo;
			System.out.println(fibo);
			
			fib(count-1);
			
			
		}
		
	}
	
	public static void main(String[] args) {
	
		int count =10;
		
		System.out.println(f+ "" +s);
		
		fib(count-2);
		

	}

	
	
}
