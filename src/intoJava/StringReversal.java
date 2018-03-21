package intoJava;

public class StringReversal {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Mudit");
		StringBuilder revStr = new StringBuilder();
		
		revStr = str.reverse();
		
		System.out.println("the reversed string is " + revStr);

	}

}
