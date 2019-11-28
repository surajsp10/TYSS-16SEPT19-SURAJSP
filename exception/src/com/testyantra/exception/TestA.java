package com.testyantra.exception;

public class TestA {
	
	
	
	public static void main(String[] args) {
		
		
		
		int [] a = {20,30,40};
		
		
		System.out.println(a[1]);
		
		
		try {
			
			System.out.println(a[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException ae) {
			
			System.out.println("Number not inn index");
			
		}
	}

}
