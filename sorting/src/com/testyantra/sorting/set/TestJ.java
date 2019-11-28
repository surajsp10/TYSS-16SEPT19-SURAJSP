package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	
public static void main(String[] args) {
		
	SortByNameC sb = new SortByNameC();
//		
//		SortByPin sp = new SortByPin();
		
//		SortByMicr sm = new SortByMicr();
		
		TreeSet<Customer> ts = new TreeSet<Customer>(sb);
		Customer c1 = new Customer("Hari",56,697697);
		Customer c2 = new Customer("Suri",71,98989);
		Customer c3 = new Customer("Curi",54,98760);
		Customer c4 = new Customer("Cari",77,2345);
		
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		System.out.println("------Using Iterator---------");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println("Name is "+c.name);
			System.out.println("Id is "+c.id);
			System.out.println("Salary is "+c.salary);
			System.out.println("------------------------------");
		}
				
	}
}
