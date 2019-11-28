package com.testyantra.objectclass;

public class Person implements Cloneable {

	
	int id;
	String name;
	
//type clone  Ctrl+[space] to get clone() method	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public Person(int id,String name) {
		
		
		super();
		this.id = id;
		this.name = name;
	}
}
