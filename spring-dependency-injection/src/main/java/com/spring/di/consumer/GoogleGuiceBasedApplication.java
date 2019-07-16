package com.spring.di.consumer;

import com.google.inject.Inject;
import com.spring.di.services.MessageService;

public class GoogleGuiceBasedApplication {
	private MessageService messageService;

	@Inject
	public GoogleGuiceBasedApplication(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public boolean processMessage(String message, String receiver){
		return this.messageService.sendMessage(message, receiver);
	}
}
