package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("roopa");
		ts.add("jaya");
		ts.add("Sushma");
		ts.add("munni");
		ts.add("sheela");
		
		for(Object s:ts) {
			System.out.println(s);
		}
		
		System.out.println("===========Using Iterator");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
	}
	}
}
