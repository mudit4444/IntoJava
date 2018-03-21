package intoJava;

public class TryCatch1 {

	public static void main(String[] args) throws Exception {
		try {
			int i = 50/0;
		}
		catch(Exception e) {
			throw new Exception();
		}
		finally {
			System.out.println("Hellow");
		}
	}

}
