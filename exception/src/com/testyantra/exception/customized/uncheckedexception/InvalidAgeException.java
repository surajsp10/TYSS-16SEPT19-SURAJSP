package com.testyantra.exception.customized.uncheckedexception;
//customized unchecked exception


public class InvalidAgeException extends RuntimeException {

	
	String message = "Invalid age below 18 years not allowed";
	
	
	public InvalidAgeException(){
		
		
	}
	
	
	public InvalidAgeException(String message) {
		
		
		
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
}
