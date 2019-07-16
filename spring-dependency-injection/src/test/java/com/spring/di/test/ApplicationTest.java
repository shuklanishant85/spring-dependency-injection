package com.spring.di.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.di.consumer.Application;
import com.spring.di.services.MessageService;

@Configuration
@ComponentScan({ "com.spring.di.consumer" })
public class ApplicationTest {

	private AnnotationConfigApplicationContext context;

	@Bean
	public MessageService messageService() {
		return new MessageService() {

			public boolean sendMessage(String message, String reciver) {
				System.out.println("mock service");
				return true;
			}
		};
	}

	@Before
	public void setUp() {
		context = new AnnotationConfigApplicationContext(ApplicationTest.class);
	}

	@Test
	public void testProcessMessage() {
		Application app = context.getBean(Application.class);
		assertTrue(app.processMessage("hi nishant", "dummy_url"));
	}

	public void tearDown() {
		context.close();
	}
}
