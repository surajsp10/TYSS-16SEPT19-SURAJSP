package com.testyantra.thread.pausing;

public class TestJooin {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		
		
	
		MyJoinThread t = new MyJoinThread();
		t.start();
		try {
			t.join(1000);
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		} 
		
	
		
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
		
		
		System.out.println("main ended");
		
	}
}
