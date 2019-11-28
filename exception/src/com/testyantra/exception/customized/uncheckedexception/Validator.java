package com.testyantra.exception.customized.uncheckedexception;

public class Validator {

	
	
	void verify(int age) {
		
		if(age < 18) {
			
			throw new InvalidAgeException("Try again next time");//this is one of the ways of throwing exception
			
		}
	}
}
