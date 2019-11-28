package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {

	
	public static void main(String[] args) {
		
		
		
		Stack<Integer> s = new Stack<>();
		s.add(12);  
		s.add(23);
		s.add(45);
		
		
		System.out.println("Using get()----");
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		
		
		//to overcome the property of not returning the last element
		//it will be stored in a variable initially
		int j=s.size();
		System.out.println("Using get()----");
		for(int i=0;i<j;i++) {
			System.out.println(s.pop());
		}
		
		
	}
}
