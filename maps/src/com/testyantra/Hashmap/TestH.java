package com.testyantra.Hashmap;

import java.util.Hashtable;

public class TestH {

	
	


	
	public static void main(String[] args) {
		
		
		Hashtable<Integer ,String> ht = new Hashtable<Integer , String>();
		ht.put(10,"ajay");
		ht.put(52,"vijay");
		ht.put(190,"sonu");
		ht.put(789,"monu");
		ht.put(61,"sriram");
		//ht.put(null,"john"); no null will be accepted for key
//		ht.put(108,null); null pointer exception will be fiven for null value in value
		
		System.out.println("Data  "+ht);
}

}
