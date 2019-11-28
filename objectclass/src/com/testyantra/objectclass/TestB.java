package com.testyantra.objectclass;

public class TestB {

	
	public static void main(String[] args) {
		
		
		

		
		Pen p = new Pen();
		
		int pHashCode = p.hashCode();
		
		System.out.println("The HasCode of  p object is  "+p.hashCode());
		
		
		Pen q = new Pen();
		
		int qHashCode = q.hashCode();
		
		System.out.println("The hascode of q is  "+q.hashCode());
	}
	
}
