package com.testyantra.lambdaexpression;

public class TestMessage {

	
	
	public static void main(String[] args) {
		
		
		
		TestMessage tm = new TestMessage();
		
		MessageInterface printmessage = (message)->{
			
			System.out.println("hello");
			System.out.println(message);
			return message;
		};
		
		
	}
}
