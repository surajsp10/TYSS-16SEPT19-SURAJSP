package com.testyantra.lambdaexpression;

public class TestAdd {

	
	
	public static void main(String[] args) {
		
		
		TestAdd t1 = new TestAdd();
		int sum = t1.add(12,20);
		System.out.println("Sum is  "+sum);
	}
	
	
 public int	add(int a,int b) {
	 
	 return a+b;
	 
 }
}
