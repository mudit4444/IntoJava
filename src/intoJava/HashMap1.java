package intoJava;

import java.util.*;
import java.util.HashMap;

class Student {
	private String name;
	//private int rollnumber;
	
	Student(String name) { // Integer rollNo) {
		this.name = name;
		//this.rollnumber = rollNo;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}



	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	
	
	
	
}

public class HashMap1 {

	public static void main(String[] args) {
		
		Student student = new Student("Mudit");
		Student student1 = new Student("Udit");
		Student student2 = new Student("AShok");
		
		HashMap<Integer , Student> map = new HashMap<Integer , Student>();
		
		map.put(26 , student);
		map.put(29 , student1);
		map.put(31 , student2);
		System.out.println("The enteries are" +map);
		
		
		Set<Map.Entry<Integer , Student>> es = map.entrySet();
		
		for(Map.Entry<Integer , Student> entry : es) {
			
			Student ss = entry.getValue();
			int key = entry.getKey();
			
			System.out.println(key + "" +ss);
			
		}
	}

	
	
	
	
		
	}
