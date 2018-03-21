package intoJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrListHashMap {

	public static void main(String[] args) {

		ArrayList <Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		arr.add(3);
		arr.add(3);
		
		
		
		
		Map<Integer , Integer> map = new HashMap<Integer , Integer>();
		
		for (Integer num : arr) {
			
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> hmap: map.entrySet()) {
			
			System.out.println(hmap.getKey() + "=" + hmap.getValue());
		}
		
		
		
	}
}

