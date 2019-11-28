package com.testyantra.abstraction.atmmachine;

public class Machine {

	
	void slot(ATM a) {
		
		
		a.validateCard();
		a.getInfo();
	}
}
