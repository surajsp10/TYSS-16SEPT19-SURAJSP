package com.testyantra.Hashmap;

import java.util.HashMap;

public class TestB {

	
	public static void main(String[] args) {
		
		
		HashMap hm = new HashMap();
		hm.put("kuku", 998014);
		hm.put("mala",67891);
		hm.put("Sheela",789789);
		
		
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu",456789);
		hm1.put("riya", 87654);
		hm1.put("kriti", 345678);
		
		
		boolean hasKey = hm.containsKey("mala");
		System.out.println("Has Key "+hasKey);
		
		
		boolean hasValue = hm1.containsValue(456789);
		System.out.println("Has Value "+hasValue);
		
		
		hm.putAll(hm1);
		System.out.println("-----------------------");
		System.out.println("After put all "+hm);
		
		System.out.println("Size of map is  --->"+hm.size());
		
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is empty "+isEmpty);
		
		hm.clear();
		System.out.println("After clear "+hm);
		
	}
}
