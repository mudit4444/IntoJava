import java.util.ArrayList;
import java.util.Iterator;


public class Collection_ArrayList {
public static void name() {
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	arr.add(1);
	arr.add(21);
	
	Iterator<Integer> it = arr.iterator();
	while(it.hasNext()){
		System.out.print(it.next());
	}
	
}
}
