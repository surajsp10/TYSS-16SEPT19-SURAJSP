package com.testyantra.beanobject.bean;

public class Database {

	
	
	void receive(Student s) {
		
		System.out.println("ID is "+s.getId());
		System.out.println("Name is "+s.getName());
		
		System.out.println("Roll no is "+s.getRollno());
		
		System.out.println("_________________________");
			
	}
	
	
	
	void save(Employee e) {
		System.out.println("_______I am database__________");
		
		
		System.out.println("Id is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
	}
}
