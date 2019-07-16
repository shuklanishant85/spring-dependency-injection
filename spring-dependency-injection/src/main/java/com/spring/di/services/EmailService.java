package com.spring.di.services;

public class EmailService implements MessageService{

	public boolean sendMessage(String message, String reciver) {
		System.out.println("Email Sent to "+reciver+ " with Message: "+message);
		return true;
	}
	
}
