package com.testyantra.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	
	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		al.add(23);
		al.add(98.7);
		al.add(true);
		al.add("Good evening");
		
		
		//Creation of iterator object
		
		Iterator it = al.iterator();
		Object o1 = it.next();
		System.out.println("obj1 "+o1);
		
		Object o2 = it.next();
		System.out.println("obj  "+o2);
		
		Object o3 = it.next();
		System.out.println("obj4 "+o3);
		
		
		
		Object o4 = it.next();
		System.out.println(o4);
		
		
//		boolean b = it.hasNext();
//		System.out.println("Has Next "+b);
//		
		
//		Object o5 = it.next();
//		System.out.println(o5);
//		
		
		System.out.println("___________________USING FOR LOOP________________");
		
		for(int i=0;i<al.size();i++) {
			
			Object o = al.get(i);

			System.out.println(o);
		}
		
		 
		ArrayList al1 = new ArrayList();
		
		al1.add(12);
		al1.add(23);
		al1.add("mom");
		al1.add(false);
		
		
		System.out.println("_____________Using Iterator____________");
		Iterator it1 = al1.iterator();
		while(it.hasNext()) {
			
			
			Object  o = it1.next();
			System.out.println(o);
		}
		
		
		
	}
}
