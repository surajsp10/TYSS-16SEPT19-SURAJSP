package com.testyantra.arrays;

public class TestA {
	
	
	public static void main(String[] args) {
		
		
		int[] num = new int [5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		
		System.out.println("______________________");
		
		for(int j : num) {
			
			
			System.out.println(j);
			
			
		}
		
		
		System.out.println("________________");
		
		char[] ch = {'a','b','c','d'};
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		for(int c:ch) {
			System.out.println(c);
		}
		
		
		System.out.println("___________");
		
		byte[] b = {34,45,56,67,78};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("__________");
		
		for(int a:b) {
			System.out.println(a);
		}
		
		System.out.println("_____________");
		
		boolean[] bl = {true,false,true,false,true,false};
		
		for(int i=0;i<bl.length;i++) {
			
			
			System.out.println(bl);
		}
		System.out.println("_____________________");
		for(boolean s : bl) {
			System.out.println(s);
		}
		
		
		
		System.out.println("_________________");
		
		String[] s1 = {"abc","def" , "ghi" , "jkl"};
		
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1);
		}
		
		System.out.println("__________________");
		
		for(String d:s1) {
			
			System.out.println(d);
		}
	}
	

}
