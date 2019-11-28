package com.testyantra.objectclass;

public class TestG {
  
	
	
	public static void main(String[] args) {
		
		
		
		Employee e  = new Employee(12, "suraj", 87987);
		
		Employee e2 = new Employee(19,"gdefu",9809);
		
		Employee e3 = new Employee(223,"fgber",76567);
		
		e2=e3;
		
		boolean isequal = e.equals(e2);
		System.out.println(isequal);
		
		boolean equals = e2.equals(e3);
	}
}
