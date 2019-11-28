package com.testyantra.collectionsframework.list;

import java.util.Collections;
import java.util.LinkedList;

//Demo for Linked list


public class TestL {

	
	
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> l =new LinkedList<Integer>();
		l.add(12);
		l.add(12);
		l.add(45);
		l.add(89);
		l.add(10);
		
		
		//any of the type list can be passed here
		//vectors arraylist
		
		
		System.out.println("Before sort "+l);
		Collections.sort(l);
		
		
		
		//cannot pass string and integer
		//only can pass generic type for sort method
		//should not pass null it will give nullpointer exception
		
		System.out.println("After sort "+l);
		
		
		Collections.reverse(l);
		System.out.println("After reverse "+l);
		
		Collections.shuffle(l);
		System.out.println("After Shuffle "+l);
		
		
	}
}
