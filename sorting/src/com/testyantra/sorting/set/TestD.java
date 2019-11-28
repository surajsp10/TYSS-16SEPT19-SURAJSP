package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	
	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<>();
		
		ls.add(23.67);
		ls.add(23.56);
		ls.add(78.94);
		ls.add(67.5);
		ls.add(34.8);
		
		
		System.out.println("_______Using for each");
		
		for(Double s:ls) {
			System.out.println(s);
		}
		
		System.out.println("Using iterator");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
	}
	}
}
