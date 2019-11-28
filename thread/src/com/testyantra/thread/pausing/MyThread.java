package com.testyantra.thread.pausing;

public class MyThread extends Thread{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i=0;i<10;i++) {
		
		System.out.println("Child Thread");
		Thread.yield();//will make the child method to wait for sometime
		}
	}

	
	
}
