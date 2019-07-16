package com.spring.di.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.di.configuration.DIConfiguration;
import com.spring.di.consumer.Application;

public class ClientApplication {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		Application application = context.getBean(Application.class);
		application.processMessage("Hi Nishant", "shuklanishant85@gmail.com");
		((AnnotationConfigApplicationContext) context).close();
	}
}
