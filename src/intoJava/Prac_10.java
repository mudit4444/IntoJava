package intoJava;

public class Prac_10 extends Parent {

	static { 
		System.out.println("Prac_10 Static");
	}
	
	Prac_10(int i) {
		System.out.println("Child Container");
	}
	
	public static void main(String[] args) {
		Parent p;
	}
	
}


class Parent {
	static {
		System.out.println("Static Parent");
	}
	
	Parent() {
		System.out.println("Parent Constructor");
	}
}