package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= SecurityAutoConfiguration.class)
public class FreeleSpringboot2WebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreeleSpringboot2WebserviceApplication.class, args);
	}

}
