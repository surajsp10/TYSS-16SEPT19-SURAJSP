package com.tyss.didemo;

import com.tyss.didemo.dao.I;
import com.tyss.didemo.util.Manager;

public class MainClass {
	
	public static void main(String[] args) {
		
		Manager manager  = new Manager();
		//injecting dependency
		I i = manager.getI();
		
		
		i.m1();
		i.m2();
		i.m3();
		
	}

}
