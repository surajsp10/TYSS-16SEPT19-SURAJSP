package com.tyss.springcore.di;

public class Human implements Animal{

	
	public Human() {
		System.out.println("Human object created");
	}
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("BLA bla bla.........");
		
	}

}
