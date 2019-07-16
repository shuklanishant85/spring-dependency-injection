package com.spring.di.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.di.services.MessageService;

@Component
public class Application {
	private MessageService messageService;

	@Autowired
	public Application(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public boolean processMessage(String message, String receiver){
		return this.messageService.sendMessage(message, receiver);
	}
}
