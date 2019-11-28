package com.testyantra.exception;

public class TestG {

	
	
	public static void main(String[] args) {
		
		
		System.out.println("Main started");
		
		
		PayTM p = new PayTM();
		try {
		p.book();
		}catch (ArithmeticException ae) {
			
			System.out.println("Exception caught in main");
			// TODO: handle exception
		}finally {
			System.out.println("Executing finally");
		}
		
		
		
		System.out.println("Main ended");
	}
}
