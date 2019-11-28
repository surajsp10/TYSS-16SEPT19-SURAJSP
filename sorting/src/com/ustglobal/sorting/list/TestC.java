package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {

	
public static void main(String[] args) {
	
	
	
	
	LinkedList<Integer> l = new LinkedList<Integer>();
	
	l.add(12);
	l.add(23);
	l.add(34);
	l.add(25);
	
	
	Integer peekElement  = l.peek();
	System.out.println("Peek Element is "+peekElement);
	
	Integer peekFirst = l.peekFirst();
	System.out.println("Peek First Element is "+peekFirst);
	
	
	Integer peekLast = l.peekLast();
	System.out.println("Peek Last Element is "+peekLast);
	
	
	Integer pollElement = l.poll();
	System.out.println("Poll Last Element is "+pollElement);
	
	Integer pollFirst = l.pollFirst();
	System.out.println("Poll Last Element is "+pollFirst);
	
	Integer pollLast = l.pollLast();
	System.out.println("Poll Last Element is "+pollLast);
	
	
	l.push(12);
	System.out.println("After push ------------> "+l);
	
	Integer p = l.pop();
	System.out.println("After pop---------------->  "+p);
	
	
}
}
