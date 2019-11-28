package com.testyantra.exception.customized.checkedexception;

public class TestAmount {

	
	public static void main(String[] args) {
		
		
		System.out.println("Method started");
		
		ValidateAmount va = new ValidateAmount();
		
		try {
		va.checkAmount(20000);
		}catch(InvalidAmountException e) {
			e.getMessage();
		}
		
		
		
		System.out.println("Method ended");
	}
}
