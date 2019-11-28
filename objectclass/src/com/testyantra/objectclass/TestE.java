package com.testyantra.objectclass;

public class TestE {

	
	public static void main(String[] args) {
		
		
		Car c = new Car(200000,"benz", "silver");
		
		int c1 = c.hashCode();
		System.out.println(" The cost is "+c1);
		
		String c2 = c.toString();
		System.out.println(c2);
		
		Car b = new Car(300000,"jaguar","black");
		
		
	}
}
