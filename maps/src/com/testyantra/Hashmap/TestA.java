package com.testyantra.Hashmap;

import java.util.HashMap;

public class TestA {

	
	public static void main(String[] args) {
		
		//toString is overriden?
		
		HashMap hm = new HashMap();
		hm.put("kuku", 998014);
		hm.put("mala",67891);
		hm.put("Sheela",789789);
		
		
		System.out.println("Data  "+hm);
		hm.put("mala", 789899);
		System.out.println("After modification "+hm);
		hm.put("dimple", 789789);
		System.out.println("After dimple " +hm);
		hm.put(null, 3456798);
		hm.put(null, 3456789);
		System.out.println("After Null "+hm);
		
		
		Object phoneno =  hm.get("Sheela");
		System.out.println("Value of "+phoneno);
		
		Object phoneno1 = hm.get("abcd");
		System.out.println("Value of "+phoneno1);
		
		
		Object value = hm.remove("kuku");
		System.out.println("Value "+value);
		
		System.out.println("After remove "+hm);
	}
}
