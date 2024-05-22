package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		
		//subject - marks
		
		//Map<String, Integer>  map = new HashMap<>();
		//Map<String, Integer>  map = new TreeMap<>();
		Map<String, Integer>  map = new LinkedHashMap<>();
		
		map.put("math", 99);
		map.put("english", 80);
		map.put("nepali", 88);
		map.put("computer", 98);
		map.put("science", 78);
		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
		
		for(String key : map.keySet()) {
			
			System.out.println(key+" = "+map.get(key));
		}
		/*
		 * a> map of country and country-code
		 * b> map of username and password
		 * c> map of courseName and fee
		 */
	}

}
