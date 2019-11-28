package com.testyantra.exception.second;

public class TestA {

	
	public static void main(String[] args) {
		
		
		System.out.println("Main Started");
		
		try {
			Thread.sleep(3000);
			
			System.out.println();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
		
		
		System.out.println("Main Ended");
		
		
	}
}
