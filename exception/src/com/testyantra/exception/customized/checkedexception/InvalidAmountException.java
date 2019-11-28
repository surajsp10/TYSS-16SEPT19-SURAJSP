package com.testyantra.exception.customized.checkedexception;

//customized checked exception demo


public class InvalidAmountException extends Exception {

	private String message = "Daily limit is 40000";
	
	
	@Override

	public String getMessage() {
		return message;
	}
	
}
