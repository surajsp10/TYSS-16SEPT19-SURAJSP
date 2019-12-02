package com.tyss.retailermanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class ORMConfig {

	//to create entity managerfactory class this is used
	@Bean
	public LocalEntityManagerFactoryBean getBean() {

		LocalEntityManagerFactoryBean bean = 
				new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("retailer-management");
		return bean;

	}

}


