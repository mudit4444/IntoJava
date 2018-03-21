import java.util.ArrayList;


public class ArrayListtoArray {

	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Hi");
		al.add("Mudit");
		
		String []str = al.toArray(new String[al.size()]);
		
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		
			
		 
		

	}

}
