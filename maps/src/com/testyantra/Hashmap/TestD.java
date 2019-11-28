package com.testyantra.Hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	
	public static void main(String[] args) {
		
		
		LinkedHashMap<String,Integer> lh = new LinkedHashMap<String,Integer>();
		lh.put("Bengaluru",560068);
		lh.put("Haryana", 134203);
		lh.put("Patna",888000);
			
		
		
		for(Map.Entry<String,Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is "+key+" --------- "+value);
				
		}
	}
}
