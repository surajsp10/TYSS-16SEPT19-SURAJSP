package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	
	public static void main(String[] args) {
		
//		SortByName sb = new SortByName();
//		
//		SortByPin sp = new SortByPin();
		
		SortByMicr sm = new SortByMicr();
		
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);
		Bank b1 = new Bank("HDFC",560068,697697);
		Bank b2 = new Bank("SBI",560071,98989898);
		Bank b3 = new Bank("CITI",560054,987609876);
		Bank b4 = new Bank("CANARA",56767677,234569875);
		
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("------Using Iterator---------");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			System.out.println("------------------------------");
		}
				
	}
}
