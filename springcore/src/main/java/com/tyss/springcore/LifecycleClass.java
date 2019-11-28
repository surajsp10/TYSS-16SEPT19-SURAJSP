package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.di.Hello;

public class LifecycleClass {


	public static void main(String[] args) {
//created object of  ClassPathXmlApplicationContext to destroy the 
//objects and close it as it is not present in Appllication
//context interface
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("beans.xml");
		
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		
		context.close();
	}
}
