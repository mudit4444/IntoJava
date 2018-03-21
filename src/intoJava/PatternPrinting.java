package intoJava;

public class PatternPrinting {

	public static void main(String [] args) {
		PatternCheck ob = new PatternCheck();
		ob.pattern();
	}
}


class PatternCheck {
	
	public void pattern() {
		int i,j;
		for(i=0; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
