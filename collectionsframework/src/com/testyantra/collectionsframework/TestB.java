package com.testyantra.collectionsframework;

import java.util.ArrayList;

public class TestB {

	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(29.7);
		al.add(true);
		al.add("China");
		
		
		
		for(Object o : al) {
			
			
			System.out.println(o);
		}
	}
}
