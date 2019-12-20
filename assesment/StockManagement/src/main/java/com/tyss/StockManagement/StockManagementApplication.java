package com.tyss.StockManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.tyss.StockManagement"})

public class StockManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockManagementApplication.class, args);
	}

}
