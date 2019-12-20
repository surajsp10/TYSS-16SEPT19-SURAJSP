package com.tyss.StockManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class HibernateConfig {
	@Bean
  public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
	  LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
	  bean.setPersistenceUnitName("stock-unit");
	  return bean;
  }
}
