package com.tyss.springcore;

import javax.security.auth.login.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.config.ConfigurationClass;
import com.tyss.springcore.di.Animal;
import com.tyss.springcore.di.Hello;
import com.tyss.springcore.di.Pet;

public class AnnotationApp {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		
		
		Hello hello1 = new Hello();
		System.out.println(hello1);
		System.out.println(hello);
		System.out.println("_____________________");
		
		//Animal animal = context.getBean(Animal.class);
		//animal.makeSound();
		
		System.out.println("_____________________--");
		//to achieve wiring
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		context.close();
		
	}
}
