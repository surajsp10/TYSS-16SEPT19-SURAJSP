package com.testyantra.exception;

public class PVR {

	public void book() {
		
		
		System.out.println("Booking started");
		
		try {
			
			int a=10/0;
			System.out.println("Booking confirmed");
			
			
			System.out.println("Logic for booking");
			
			
			System.out.println("Booking confirmed");
		}catch(ArithmeticException ae){
			
			System.out.println("Try booking later");
			throw ae;
		}
		
		
		System.out.println("Booking Ended");
	}
	
}
