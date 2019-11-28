package com.testyantra.thread.properties;

public class MyIdThread extends Thread {
	
	public static void main(String[] args) {
		
		
		System.out.println("Main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("myid thread "+mi.getId());
		
//		mi.setId(5); no setId method we can only get the Id of the thread
		
	//	Thread.currentThread().setPriority(16); IllegalArgumentException
		
		
		System.out.println("Main ended");
	}

}
