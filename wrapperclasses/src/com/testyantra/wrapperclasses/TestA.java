package com.testyantra.wrapperclasses;

public class TestA {
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a is "+a);
		//autoboxing
		Integer i = a;
		System.out.println("i is "+i);
		
		
		Integer x = 10;
		System.out.println("x is "+x);
		//unboxing or autounboxing
		int y = x;
		System.out.println("y is "+y);
		
		
		int value = Integer.parseInt("896");
		System.out.println("Value is "+value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("Result is "+result);
		
		
	}

}
