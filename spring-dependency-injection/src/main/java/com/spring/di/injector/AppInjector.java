package com.spring.di.injector;

import com.google.inject.AbstractModule;
import com.spring.di.services.FacebookService;
import com.spring.di.services.MessageService;

public class AppInjector extends AbstractModule{

	@Override
	protected void configure() {
		bind(MessageService.class).to(FacebookService.class);
	}

}
