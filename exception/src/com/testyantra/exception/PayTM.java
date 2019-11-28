package com.testyantra.exception;

public class PayTM {
	
	void book() {
		
		
		System.out.println("PAYTM started");
		
		
		
		IRCTC i = new IRCTC();
		i.confirm(); 
		
		
		
		System.out.println("PAYTM ended");
	}

}
