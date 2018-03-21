
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int f=0, s=1;
		int count = 0;
		int fib =0;
		while( count < 10) {
			fib = f+s;
			
			f=s;
			s=fib;
			
			System.out.println(fib);
			
			count++;
		}

}
}
