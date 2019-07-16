package com.spring.di.services;

public class FacebookService implements MessageService{

	public boolean sendMessage(String message, String reciver) {
		System.out.println("Facebook message Sent to "+reciver+ " with Message: "+message+ " ");
		return true;
	}

}
