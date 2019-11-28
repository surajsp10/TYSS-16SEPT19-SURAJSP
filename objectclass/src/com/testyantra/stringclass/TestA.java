//String class Demo
package com.testyantra.stringclass;

public class TestA {

	
	public static void main(String[] args) {
		
		
		String s1 = "aishu";
		String s2 = "deepika";
		
		String s3 = new String("aishu");
		String s4 = new String("aishu");
		
		String s5 = "aishu"; //"=" operator will check the value and then point to the same variable
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));//equals method is overridden is object class it compares the contents of object class
		System.out.println(s1.contentEquals(s5));
		
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		
		char c = s1.charAt(0);
		System.out.println(c);
		
		boolean b = s1.equalsIgnoreCase("AISHu");
		System.out.println(b);
		
		StringBuffer sb1 = new StringBuffer("kavya");
		sb1.append("xyz");
		System.out.println(sb1);
	}
}
