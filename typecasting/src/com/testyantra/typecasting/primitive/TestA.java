package com.testyantra.typecasting.primitive;

public class TestA {

	
	public static void main(String[] args) {
		
		
			float a =10f;
			int y = (int)a;
			System.out.println(y);//explicit typecasting
			
			System.out.println("___________________");
			
			byte c =10;
			int b = c;
			System.out.println("b is"+b);//implicit typecasting
			
			
			double x = 20.67;
			int z = (int) x;
			byte k = (byte) x;
			double f = k;
			
			
			System.out.println(k);
			
			System.out.println("_______________________");
			int g = 43;
			char h = (char)g;
			System.out.println(h);
			
	}
}
