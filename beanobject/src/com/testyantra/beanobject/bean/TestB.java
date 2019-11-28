package com.testyantra.beanobject.bean;

import java.util.Scanner;

public class TestB {

	
	public static void main(String[] args) {
		
		
		System.out.println("Scanner class");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Age is "+age);
		
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("The Name is  "+name);
		
		
		System.out.println("Enter full name ");
		String fname = sc.nextLine();
		System.out.println("The full name is "+fname);
		
		
		System.out.println("Are you Male?");
		boolean a = sc.nextBoolean();
		System.out.println(a);
	}
}
