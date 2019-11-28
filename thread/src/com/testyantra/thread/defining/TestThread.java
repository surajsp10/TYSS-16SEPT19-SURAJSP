package com.testyantra.thread.defining;

public class TestThread {

	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Main started");
		
		Mythread m = new Mythread();
		m.start();
		
		
		
		for(int i=0;i<10;i++) {
			
			System.out.println("Main meethod");
		}
		
		System.out.println("Main ended");
	}
}
