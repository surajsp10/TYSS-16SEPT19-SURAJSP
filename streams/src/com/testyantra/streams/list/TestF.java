package com.testyantra.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {

	
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(70);
		marks.add(25);
		marks.add(35);
		marks.add(30);
		marks.add(90);
		marks.add(54);
		marks.add(56);
		marks.add(45);
		
		List<Integer> l = marks.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> it = l.iterator();
		System.out.println("Sorted--------->");
		while(it.hasNext()) {
			
			Integer i = it.next();
		
			System.out.println(i);
		}
	}
}
