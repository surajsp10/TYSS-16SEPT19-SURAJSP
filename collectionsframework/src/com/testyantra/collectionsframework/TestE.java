package com.testyantra.collectionsframework;

import java.util.ArrayList;

public class TestE {

	
	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		al.add("Shreya");
		
		//downcasting to access the child specific members
		Object o = al.get(0);
		String name = (String) o;
		
		name = name.toUpperCase();
		System.out.println(name);
		
	}
}
