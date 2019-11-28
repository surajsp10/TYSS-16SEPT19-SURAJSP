package com.testyantra.singleton;

public class Test {

	
	
	public static void main(String[] args) {
		
		
		MySingleton ms = MySingleton.getDbConnection();
		
		ms.s = "Hello";
		System.out.println("HashCode of ms  "+ms.hashCode());
		
		
		MySingleton mx = MySingleton.getDbConnection();
		ms.s = "Hi";
		System.out.println("HashCode of mx  "+mx.hashCode());
	}
}
