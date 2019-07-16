package com.spring.di.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.consumer.XmlApplication;

public class ClientXmlApplication {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		XmlApplication application = (XmlApplication) context.getBean("xmlApplication");
		application.processMessage("Hi Nishant", "Nishant_Shukla@twitter.com");
		((ClassPathXmlApplicationContext)context).close();
	}
}
