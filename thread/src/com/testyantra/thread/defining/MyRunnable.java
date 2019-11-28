package com.testyantra.thread.defining;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
	
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
		// TODO Auto-generated method stub
		
	}
	

}
