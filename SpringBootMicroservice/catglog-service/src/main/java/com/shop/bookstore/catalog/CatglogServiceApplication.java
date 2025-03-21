package com.shop.bookstore.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CatglogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatglogServiceApplication.class, args);
	}

}
