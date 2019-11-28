package com.testyantra.exception;

public class TestC {

	
		
		
		public static void main(String[] args) {
			
			
			
			
			System.out.println("Main started");
			
			
			int[] a = {2,5,6,7};
			int b = 10;
			
			try {
				b=10/2;
				System.out.println(b);
			
				System.out.println(a[4]);
			}
			
			catch(ArithmeticException ae) {
				System.out.println("number is divided by zero");
			}
			
			catch(ArrayIndexOutOfBoundsException ae) {
				
				System.out.println("number is out of index");
			
			System.out.println(b);
			System.out.println("main ended");
		}
			
	}

}
