package com.testyantra.Hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestE {


	public static void main(String[] args) {




		TreeMap<String,Integer> lh = new TreeMap<String,Integer>();
		lh.put("Bengaluru",560068);
		lh.put("Haryana", 134203);
		lh.put("Patna",888000);
//		lh.pu(null,09765); //because of null pointer Exception
		
		
		for(Map.Entry<String,Integer> m :lh.entrySet()) {
			
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is "+key);
			System.out.println("Value is "+value);
			System.out.println("-----------------");
			
		}
	}
}
