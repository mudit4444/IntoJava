import java.io.*;
import java.util.*;
public class CollectionLL{
	public static void main(String args[]){
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ank");
		al.add("mnj");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());	
		}
}
	
	

}
