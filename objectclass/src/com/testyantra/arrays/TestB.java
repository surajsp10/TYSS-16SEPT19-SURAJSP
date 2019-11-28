package com.testyantra.arrays;

public class TestB {

	
	
	private static int[] names;

	public static void main(String[] args) {
		
		
		int[] nums = {12,23};
		String[] names1;
	//to check arrayindexoutof boundexceptio	
//		System.out.println(nums[20]);
		
		receive(nums);
		int[] values = getArray();
		
		for(int val : values) {
			System.out.println(val);
		}
		
		receive(names);
		String names = getString();
		
		for(String nam : names ) {
			System.out.println();
		}
		
	}
	
	//array can also be passed as parameters
	static void receive(int[] numbers) {
		
		for(int num:numbers) {
			
			System.out.println(num);
		}
	}
	
	
	//to return an array
	
	static int[] getArray() {
		
		int[] values = {20,30,40,50};
		
		return values;
	}
	
	//receiving String objects
	static void receiveString(String[] names) {
		
		for(String nam: names) {
			System.out.println(nam);
		}
		
		
	}
	
	static String[] getString() {
		 
		String[] names1 = {"disha","ananya","kiara"};
		return names1;
	}
}
