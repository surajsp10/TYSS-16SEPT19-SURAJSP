package com.testyantra.sorting.set;

import java.util.Comparator;

public class SortByPin implements Comparator<Bank> {
	
	
	
	@Override
	public int compare(Bank o1, Bank o2) {
		
		Integer a = o1.pincode;
		Integer b = o2.pincode;
		
		return a.compareTo(b);
	}


	
	
}
