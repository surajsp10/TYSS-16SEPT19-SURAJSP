package com.testyantra.exception;

public class TestD {

	
		
		
		public static void main(String[] args) {
			
			
			
			
			System.out.println("Main started");
			
			
			int[] a = {2,5,6,7};
			int b = 10;
			String s = "hello";
			
			try {
				b=10/2;
				System.out.println(b);
				System.out.println(a[2]);
				System.out.println(b/0);
	
			}catch(ArithmeticException ae) {
				System.out.println("number is divided by zero");
			}catch(ArrayIndexOutOfBoundsException aie) {
				
				System.out.println("number is out of index");
			}
			catch(NullPointerException n) {
				
				System.out.println("Do not play with null");
			}

			
			//general catch block
			catch(Exception e) {
				e.printStackTrace();
			}
			
			 
			System.out.println(b);
			System.out.println("main ended");
	}

}
