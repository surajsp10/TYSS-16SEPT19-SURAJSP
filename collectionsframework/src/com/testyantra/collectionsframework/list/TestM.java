package com.testyantra.collectionsframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {

	
	public static void main(String[] args) {
		
		
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("girija");
		al.add("vanaja");
		al.add("jalaja");
		al.add("kiran");
		
		
		
		System.out.println("Before sort----> "+al);
		//to sort
		Collections.sort(al);
		
		System.out.println("After sort----> "+al);
	}
}
