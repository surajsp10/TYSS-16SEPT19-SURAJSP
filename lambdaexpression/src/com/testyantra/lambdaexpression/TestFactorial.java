package com.testyantra.lambdaexpression;

public interface TestFactorial {

	
	
	
	public static void main(String[] args) {
		
		
		
		FactorialInterface fi = (n)->{
			
			int fact = 1;
			for(int i=0;i<=n;i++) {
				fact= fact*i;
			}
			
			return fact;
		};
		
		
		int factotal = fi.factoria(9);
		System.out.println("Fact total  "+factotal);
	}
	
}
