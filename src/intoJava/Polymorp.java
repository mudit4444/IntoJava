class A{
	public void test(){
		System.out.println("1");
	}
}
	class B extends A{
		public void test(){
			System.out.println("This is ME");
		}
	}

public class Polymorp {
	public static void main(String [] args){
		A obj = new A();
		obj.test();
	/*	A obj1 = new B();
		obj1.test(); */
	}
}

