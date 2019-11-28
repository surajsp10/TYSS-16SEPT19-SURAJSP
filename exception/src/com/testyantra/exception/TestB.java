package com.testyantra.exception;
//to know that variables used in try block must be initialized
//in case the try catch block never executed
public class TestB {

	
	
	public static void main(String[] args) {
		
		
		
		
		System.out.println("Main started");
		
		
		int a = 6;
		int b = 0;
		
		try {
			b=10/0;
			//once an exception is seen anywhere 
			//in this block it will straight go to catch block
			System.out.println("Hello");
			System.out.println("Happy Deepavali");
			
		}
		
		catch(ArithmeticException ae) {
			System.out.println("number is divided by zero");
		}
		
		System.out.println(b);
		System.out.println("main ended");
	}
}
