package com.testyantra.thread.properties;

public class MyThread extends Thread {

	
	public static void main(String[] args) {
	
		System.out.println("Main started");
		
		
		
		//to know  the name of the current thread name
		String tname = Thread.currentThread().getName();
		System.out.println("Current thread "+tname);
		
		MyThread t1 = new MyThread();
		String mname = t1.getName();
		System.out.println("THread name "+ mname);
		
		
		//to change the name of the thread setName is used 
		//parameter will be String for setName() method
		
		Thread.currentThread().setName("BAla");
		
		
		
		t1.setName("golu");
		System.out.println("My thread name "+t1.getName());
		
		System.out.println(10/0);
		
		
		System.out.println("Main Ended");
		
	}
}
