package com.testyantra.typecasting.reference;

public class TestB {
	
	
	
	public static void main(String[] args) {
		
		
		
		Pen p = new Marker();
				System.out.println(p.cost);//upcasting
		p.write();
		
		
		//System.out.println(p.size);		not possible
		
		//p.color();				not possible
		
		
		Marker m =(Marker) p;//downcasting
		System.out.println(m.size);
		m.write();
		m.color();
		
		
		
		
		
	}

}
