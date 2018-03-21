package intoJava;

import java.util.*;
public class CollectionPrac {
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("nmo");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("abc");
		al2.add("ujh");
		
		al.retainAll(al2);//checks for the common enrty in al and al2 collection, if something is common then it deletes everything but that entry
		
	System.out.println("Hello");
	Iterator<String> itr = al.iterator();//even iterator needs to be generic
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	}

}
