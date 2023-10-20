package com.spike80.iphone_classes.router;

import com.spike80.iphone_classes.browser.InterfaceBrowser;
import com.spike80.iphone_classes.phone.InterfacePhone;
import com.spike80.iphone_classes.player.InterfacePlayer;

public class Router implements InterfaceBrowser, InterfacePhone, InterfacePlayer{

	@Override
	public void showingPage() {
		System.out.println("Showing Page via router.");
		
	}

	@Override
	public void addNewPage() {
		System.out.println("New Page added via router.");
		
	}

	@Override
	public void refreshPage() {
		System.out.println("Done! via router.");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Playing music via router.");
		
	}

	@Override
	public void pauseMusic() {
		System.out.println("Music paused via router");
		
	}

	@Override
	public void selectMusic() {
		System.out.println("Select your music via router");
		
	}

	@Override
	public void call() {
		System.out.println("Calling..., via router");
		
	}

	@Override
	public void pickUp() {
		System.out.println("Hi! Whos calling, via router");
		
	}

	@Override
	public void voiceMail() {
		System.out.println("Calling Voicemail, via router");
		
	}

}
