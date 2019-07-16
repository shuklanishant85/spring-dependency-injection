package com.spring.di.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.spring.di.consumer.GoogleGuiceBasedApplication;
import com.spring.di.injector.AppInjector;

public class ClientGuiceApplication {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppInjector());
		GoogleGuiceBasedApplication app = injector.getInstance(GoogleGuiceBasedApplication.class);
		app.processMessage("Hi Nishant", "nishant._.shukla@facebook.com");
	}
}
