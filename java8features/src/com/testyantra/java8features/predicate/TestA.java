package com.testyantra.java8features.predicate;

import java.util.function.Predicate;

import com.testyantra.java8features.Student;

public class TestA {

	
	
public static void main(String[] args) {
		
		
		Predicate<Employee> p = s->{
			if(s.salary >=35) {
				return true;
			}else {
				return false;
			}
		};
		
		Employee s = new Employee(1,"anup",45.6);
		boolean a = p.test(s);
		System.out.println("Result  "+a);
		
		
	}
}
