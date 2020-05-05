package com.graduation.project.config;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc

@PropertySource({ "classpath:application.properties" })
public class AplicationConfig {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Bean
	@Primary
	public SessionFactory getSessionFactory() {
	    if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
	        throw new NullPointerException("factory is not a hibernate factory");
	    }
	    return entityManagerFactory.unwrap(SessionFactory.class);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		
	   return builder.build();
	}
}