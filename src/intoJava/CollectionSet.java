package intoJava;

import java.io.*;
import java.util.*;
import java.util.Iterator;
public class CollectionSet {
	public static void main(String args[]){
		HashSet<String> hs = new HashSet<String>();
		hs.add("nhu");
		hs.add("bhg");
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());	
		}
	}

}
