package com.testyantra.immutable;



public class TestString {

	
	public static void main(String[] args) {
		
		
		MyString ms = new MyString(12, "namitha");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println(ms);
		
		MyString ms1 = ms.changeContent(20, "namratha");
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		
		System.out.println("_________________________");
		
		System.out.println(ms1);
		System.out.println(ms1);
	}
}
