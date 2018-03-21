package intoJava;

import java.util.HashMap;
import java.util.Map;


public class HashMapPrac {

	
	public static void main(String[] args) {
		Map<String , String> map = new HashMap<String , String>();
		map.put("Mamta", "Bajpai");
		map.put("Mamta", "Bajpai");
		map.put("Udit", "Bajpai");
		map.put("Anil", "Bajpai");
		
		
		for(Map.Entry<String, String> hm : map.entrySet()) {
			System.out.println("Name is " +hm.getKey() + " and Sirname is " +hm.getValue());
			System.out.println("Specific name is " +hm.hashCode());
		}
	}

}