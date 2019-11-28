package com.testyantra.exception;

public class TestF {

	
		
		
		public static void main(String[] args) {
			
			
			
			
			System.out.println("Main started");
			
			
			int[] a = {2,5,6,7};
			int b = 10;
			
			try {
				b=10/0;
				System.out.println(b);
	
			}catch(Exception e) {
				e.printStackTrace();//to know which exception has occured this is used
				
			}
			
			
			
			
			 
			System.out.println(b);
			System.out.println("main ended");
	}

}
