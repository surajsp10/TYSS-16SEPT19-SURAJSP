package com.testyantra.objectclass;
//demop for get Class method
public class Remote {
	
	void add() {
		
		System.out.println("ADD method");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		
		Remote r = new Remote();
		Class c = r.getClass(); // c is a variable of type class
		
		Object o = c.newInstance();//one of the ways of creating object other than new
		
		Remote q = (Remote)o;//down-casting
		q.add();
		
	}

}
