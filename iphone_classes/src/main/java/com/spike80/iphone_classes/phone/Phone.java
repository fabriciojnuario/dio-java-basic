package com.spike80.iphone_classes.phone;

public class Phone implements InterfacePhone {

	@Override
	public void call() {
		System.out.println("Calling...");
		
	}

	@Override
	public void pickUp() {
		System.out.println("Hi! Whos calling?...");
		
	}

	@Override
	public void voiceMail() {
		System.out.println("Calling Voicemail...");
		
	}

}
