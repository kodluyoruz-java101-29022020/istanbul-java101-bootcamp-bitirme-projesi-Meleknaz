package com.graduation.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.spring.boot.application.dao.jpa.repository" })
@SpringBootApplication
public class Aplication {
	
	public static void main(String[]  args) {
		SpringApplication.run(Aplication.class, args);
		
	}

}
