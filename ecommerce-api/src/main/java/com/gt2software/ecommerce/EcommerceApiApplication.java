package com.gt2software.ecommerce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApiApplication {

	private static final Logger logger = LoggerFactory.getLogger(EcommerceApiApplication.class);

	public static void main(String[] args) {
		logger.info("Starting Ecommerce API Application... please wait");
		SpringApplication.run(EcommerceApiApplication.class, args);
		logger.info("Ecommerce API Application started successfully.");
	}

}
