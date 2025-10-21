package com.gt2software.ecommerce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EcommerceApiApplication extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(EcommerceApiApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EcommerceApiApplication.class);
	}

	public static void main(String[] args) {
		logger.info("Starting Ecommerce API Application... please wait");
		SpringApplication.run(EcommerceApiApplication.class, args);
		logger.info("Ecommerce API Application started successfully.");
	}

}
