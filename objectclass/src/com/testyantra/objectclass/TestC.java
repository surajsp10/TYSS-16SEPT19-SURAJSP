package com.testyantra.objectclass;

public class TestC {
	
	public static void main(String[] args) {
		
		
		
		Marker  m =  new Marker();
		
		int h = m.hashCode();
		String s = m.toString();
		
		System.out.println(h);
		System.out.println("The texxt type "+s);
	}

}
