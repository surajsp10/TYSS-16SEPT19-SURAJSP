package com.testyantra.Hashmap;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
public class TestG2 {

	
	public static void main(String[] args) {
		
		
		Employee s1 = new Employee(2,"divya",67.89);
		Employee s2 = new Employee(5,"ambika",56.67);
		Employee s3 = new Employee(12,"kiran",45.67);
		Employee s4 = new Employee(34,"dinesh",78.9);
		Employee s5 = new Employee(1,"chinnu",35.67);
		Employee s6 = new Employee(8,"giri",67.8);
		Employee s7 = new Employee(4,"sonu",45.78);
		Employee s8 = new Employee(7,"sweety",89.9);
		Employee s9 = new Employee(45,"dimple",33.3);
		
		
		ArrayList<Employee> al = new ArrayList<>();
	
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Employee> al2 = new ArrayList<>();	
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		ArrayList<Employee> al3 = new ArrayList<>();
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
		
		
		HashMap<String,ArrayList<Employee>> hm = new HashMap<>();
		hm.put("Manager1", al);
		hm.put("Manager2", al2);
		hm.put("Manager3", al3);
		
		
		ArrayList<Employee> manager1 = hm.get("Manager1");
		
		
		Iterator<Employee> it = manager1.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println("----------manager 1 -----------");
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Salary is "+s.salary);
			System.out.println("--------------------------");
			
		}
		
		
	ArrayList<Employee> manager2 = hm.get("Manager2");
		
		
		Iterator<Employee> it1 = manager2.iterator();
		while(it1.hasNext()) {
			Employee s = it1.next();
			System.out.println("----------Manager 2----------");
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Salary is "+s.salary);
			System.out.println("--------------------------");
			
		}
		
		
		
	ArrayList<Employee> manager3 = hm.get("Manager3");
		
		
		Iterator<Employee> it2 = manager3.iterator();
		while(it2.hasNext()) {
			Employee s = it2.next();
			System.out.println("----------------manager 3--------------");
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Salary is "+s.salary);
			System.out.println("--------------------------");
			
		}
		
		
		
		
	}
}
