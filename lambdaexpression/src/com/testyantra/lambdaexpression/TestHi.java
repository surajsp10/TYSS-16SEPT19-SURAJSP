package com.testyantra.lambdaexpression;

public class TestHi {

	
	public static void main(String[] args) {
		
		
		TestHi th = new TestHi();
		
		HiInterface2 m = (message)->{
			System.out.println(message);
			return message;
		};
		
		
	}
}
