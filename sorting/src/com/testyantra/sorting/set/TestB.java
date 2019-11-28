package com.testyantra.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	
	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<>();
		hs.add("vijay");
		hs.add("ajay");
		hs.add("sujay");
		hs.add("drijay");
		hs.add("enjoy");
		
		
		System.out.println("-----------Using For Each");
		for(String s : hs) {
			System.out.println(s);
		}
		
		System.out.println("===========Using Iterator");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
	}
	}
}
