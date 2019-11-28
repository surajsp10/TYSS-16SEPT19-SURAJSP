package com.testyantra.java8features;

import java.util.ArrayList;

public class TestG {

	
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(5,"vikram",56.7));
		al.add(new Student(3,"vijay",67.8));
		al.add(new Student(6,"yash",50.7));
		al.add(new Student(2,"akshay",65.9));
		al.add(new Student(2,"aishu",95.9));
		al.add(new Student(1,"raj",20.99));
		
		
		Helper h = new Helper();
		h.displayFailedStudents(al);
	}
}
