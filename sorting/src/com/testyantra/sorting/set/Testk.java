package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Testk {

	
	public static void main(String[] args) {
		
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(12);
		pq.add(24);
		pq.add(35);
		pq.add(56);
//		pq.add(null);
		
		
		System.out.println("Before Poll "+pq);
		System.out.println("-----------Using Iterator");
		
		Iterator<Integer> it = pq.iterator();
		
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("After Poll "+pq);
		
	}
}
