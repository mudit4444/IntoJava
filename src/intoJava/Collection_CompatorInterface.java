import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Collection_CompatorInterface {

	
	public static void main(String[] args) {
	
		List<String> arr = new ArrayList<String>() ;
		
		System.out.println("LIST OF STRINGS:");
		arr.add("Physics");
		arr.add("Chemistry");
		arr.add("Maths");
		arr.add("English");
		arr.add("Biology");
		
		/*Collections.sort(arr, new Process1());
		for(String animals : arr) {
			System.out.println(animals);
		}*/
		
		Collections.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
			
				return -s1.compareTo(s2);
			}
		});
		for(String animals : arr) {
			System.out.println(animals);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
	//	System.out.println("LIST OF INTERGERS:");
		numbers.add(10);
		numbers.add(1);
		numbers.add(188);
		numbers.add(2);
		numbers.add(0);
		numbers.add(25);
		
		
		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer d1, Integer d2) {
				return d1.compareTo(d2);
			}	
		});
		for(Integer num : numbers) {
			System.out.println(num);
		}

	}

}

class Process1 implements Comparator<String> {
	
		public int compare (String s1, String s2) {
			
			return s1.compareTo(s2);
		}
	
}
