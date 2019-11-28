package com.testyantra.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	
	public static void main(String[] args) {
		
		
		Student s1 = new Student(2,"divya",67.89);
		Student s2 = new Student(5,"ambika",56.67);
		Student s3 = new Student(12,"kiran",45.67);
		Student s4 = new Student(34,"dinesh",78.9);
		Student s5 = new Student(1,"chinnu",35.67);
		Student s6 = new Student(8,"giri",67.8);
		Student s7 = new Student(4,"sonu",45.78);
		Student s8 = new Student(7,"sweety",89.9);
		Student s9 = new Student(45,"dimple",33.3);
		
		
		ArrayList<Student> al = new ArrayList<>();
	
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al2 = new ArrayList<>();	
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		ArrayList<Student> al3 = new ArrayList<>();
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
		
		
		HashMap<String,ArrayList<Student>> hm = new HashMap<>();
		hm.put("First", al);
		hm.put("Second", al2);
		hm.put("Third", al3);
		
		
		ArrayList<Student> first = hm.get("second");
		
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("--------------------------");
			
		}
		
		
		
		
	}
}
