package com.spring.di.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.spring.di.consumer.GoogleGuiceBasedApplication;
import com.spring.di.services.MessageService;

public class GoogleguiceApplicationTest {

	private Injector injector;
	
	static class MockMessageService implements MessageService{

		public boolean sendMessage(String message, String reciver) {
			System.out.println("mock service");
			return true;
		}
		
	}
	
	
	@Before
	public void setUp(){
		injector = Guice.createInjector(new AbstractModule(){

			@Override
			protected void configure() {
				bind(MessageService.class).to(MockMessageService.class);
			}
			
		});
	}
	
	@Test
	public void testProcessMessage(){
		GoogleGuiceBasedApplication app = injector.getInstance(GoogleGuiceBasedApplication.class);
		assertTrue(app.processMessage("mock msg", "mock receiver"));
	}
	
	@After
	public void tearDown(){
		injector = null;
	}
	
}
