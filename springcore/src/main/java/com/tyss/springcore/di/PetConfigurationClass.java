package com.tyss.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
public class PetConfigurationClass {
	
	public PetConfigurationClass() {
		
	}
	public PetConfigurationClass(String name,Animal animal) {
		this.name = name;
		this.animal = animal;
	}
	
	private String name;
	@Autowired
	
	//qualifies the name written inside
	//to create the object 
	@Qualifier("cat")
	private Animal animal;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
