package com.testyantra.objectclass;

public class TestA {

	
	
	public static void main(String[] args) {
	
		
		PenDrive p = new PenDrive();
		UsbPort.connect(p);
		
		Mouse m = new Mouse();
		UsbPort.connect(m);
		
	}
}
