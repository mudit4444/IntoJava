package intoJava;

import java.util.HashMap;
import java.util.Map;

public class CustomHashMap {

	public static void main(String[] args) {
		
	Map<Integer , Candidate> myMap = new HashMap<>();
	
	System.out.println("Entering the values");
	Candidate c1 = new Candidate("Mudit" , 1);
	myMap.put(1 , c1);
	System.out.println("the values are " +myMap.get(1).getName() + " and the corresponding key is " +myMap.get(1).getNumber());
	
	Candidate c2 = new Candidate("Manmohan" , 2);
	myMap.put(2 , c2);
	
	}
}


class Candidate {
	
	private String name;
	private int number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Candidate() {}
	public Candidate(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
