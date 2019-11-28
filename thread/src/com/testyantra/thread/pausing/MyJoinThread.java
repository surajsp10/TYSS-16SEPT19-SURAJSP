package com.testyantra.thread.pausing;

public class MyJoinThread extends Thread {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			
			System.out.println("Child thread ");
			
			
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
	}
}
