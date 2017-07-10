package com.slend.entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.slend")
@EnableTransactionManagement
public class SpringBootJerseyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJerseyApplication.class, args);
	}
}
