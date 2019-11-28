package com.testyantra.lambdaexpression;

public class TeastMultiply {

	
	
	public static void main(String[] args) {
		
		
		
		MultiplyInterface multi = (a,b)->a*b;
		int m = multi.multiply(20, 5);
		
		System.out.println("The Product is  "+m);
	}
}
