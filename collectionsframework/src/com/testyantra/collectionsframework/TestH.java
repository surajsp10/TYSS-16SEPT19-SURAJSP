package com.testyantra.collectionsframework;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {

	
	
	public static void main(String[] args) {
		
		
		
		Vector li = new Vector();
		

		li.add(12);
		li.add(34.5);
		li.add("more");
		li.add(true);
		li.add(null);
		
		
		System.out.println("________USing for loop_____");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
		for(Object object : li) {
			
			System.out.println(object);
		}
		
		
		System.out.println("________________Using iterator");
		
		Iterator it = li.iterator();
		while(it.hasNext()) {
			
			
			Object o = it.next();
			System.out.println(o);
		}
		
		
		
		
		System.out.println("_________________Using list iterator");
		ListIterator lt = li.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("____________ListIterator backward_______");
		while(lt.hasPrevious()) {
			
			Object o = lt.previous();
			System.out.println(o);
		}
		
	}
	
}

