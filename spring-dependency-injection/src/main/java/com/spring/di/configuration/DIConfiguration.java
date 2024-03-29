package com.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.di.services.EmailService;
import com.spring.di.services.MessageService;

@Configuration
@ComponentScan(value={"com.spring.di.consumer"})
public class DIConfiguration {
	
	@Bean
	public MessageService messageService(){
		return new EmailService();
	}
	
}
