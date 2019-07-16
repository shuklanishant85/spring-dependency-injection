package com.spring.di.consumer;

import com.spring.di.services.MessageService;

public class XmlApplication {

	private MessageService messageService;

	public XmlApplication(MessageService messageService) {
		this.messageService = messageService;
	}

	public boolean processMessage(String message, String receiver) {
		return this.messageService.sendMessage(message, receiver);
	}

}
