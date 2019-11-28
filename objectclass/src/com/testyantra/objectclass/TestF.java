package com.testyantra.objectclass;
///to test equals method 
public class TestF {

	
	public static void main(String[] args) {
		
			Cow c = new Cow(23, "ganga",43000 );
			
			Cow c1 = new Cow(24, "gowri",30000);
			
			Cow c3 = new Cow(2,"ganga" , 10000);
			
			Cow c4 = c3;
			
			
			
//			to print hashcode before comparing
//			System.out.println(c1.hashCode());
//			System.out.println(c2.hashCode());
//			System.out.println(c3.hashCode());
			
			
			boolean isEqual = c1.equals(c);
			
			System.out.println(c1.equals(c3));
			System.out.println(c3.equals(c4));
			
			System.out.println(isEqual);
		
		
	}
	
}
