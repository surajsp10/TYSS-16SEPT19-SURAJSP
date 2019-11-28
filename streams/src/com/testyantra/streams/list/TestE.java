package com.testyantra.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestE {

	
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
		
		Comparator<Integer> cmp = (m1,m2)->{
			if(m1>m2) {
				return 1;
			}else if(m1<m2) {
				return -1;
			}
		else {
			return 0;
			}
	};
		
		
		
		long noOfFailedStudents = marks.stream().filter(i -> i<40).count();
		
		System.out.println(noOfFailedStudents);
		
		System.out.println("-----------------");
		
		
		//to find the student with less no of marks
		
		System.out.println("---------------------------");
		Integer j = marks.stream().min(cmp).get();
		System.out.println("Min value "+j);
		
		

		System.out.println("---------------------------");
		Integer h = marks.stream().max(cmp).get();
		System.out.println("Max value "+h);
		
	}
}
