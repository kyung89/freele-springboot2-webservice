package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication(exclude= SecurityAutoConfiguration.class)
public class FreeleSpringboot2WebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreeleSpringboot2WebserviceApplication.class, args);
	}

}
