package com.spring.di.services;

public class TwitterService implements MessageService {

	public boolean sendMessage(String message, String reciver) {
		System.out.println("Twitter message Sent to "+reciver+ " with Message="+message);
		return true;
	}

}
