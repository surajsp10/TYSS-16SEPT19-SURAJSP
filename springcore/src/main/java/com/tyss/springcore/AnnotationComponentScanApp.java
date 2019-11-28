package com.tyss.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.config.CompomnentScanConfig;
import com.tyss.springcore.di.Hello;
import com.tyss.springcore.di.Pet;

public class AnnotationComponentScanApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(CompomnentScanConfig.class);
		

		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I love Java");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Goooogle");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
				
	}
}
