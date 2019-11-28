package com.testyantra.java8features;

import java.util.function.Function;

public class TestC {

	
	
	public static void main(String[] args) {
		
		
		
		Function<Integer,Integer> f = i -> i*i;
		int res = f.apply(5);
		System.out.println("Square of 5 "+res);
		
		int result = f.apply(7);
		System.out.println("Square of 7 "+result);
	}
}
