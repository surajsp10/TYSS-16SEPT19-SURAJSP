package com.tyss.springcore.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {

//	 public Hello() {
//		System.out.println("Hello object created");
//	}
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	//to initialize from here
	//
	@PostConstruct
	public void init() {
		System.out.println("Init method executing from hello");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method executing from hello");
	}
	
}