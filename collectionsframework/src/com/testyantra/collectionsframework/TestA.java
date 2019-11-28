package com.testyantra.collectionsframework;

import java.util.ArrayList;

//arraylist demo
public class TestA {

	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(23);
		al.add("Alia");
		al.add(true);
		al.add(null);
		al.add('A');
		
		
		for(int i=0;i<6;i++) {
			
			
			Object obj = al.get(i);//return type of get method id object
			System.out.println(obj);
			
			
		}
		
		
	}
}
