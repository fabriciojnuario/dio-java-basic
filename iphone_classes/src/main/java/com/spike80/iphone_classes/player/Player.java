package com.spike80.iphone_classes.player;

public class Player implements InterfacePlayer{

	@Override
	public void playMusic() {
		System.out.println("Playing music.");
		
	}

	@Override
	public void pauseMusic() {
		System.out.println("Music paused.");
		
	}

	@Override
	public void selectMusic() {
		System.out.println("Select your music!");
		
	}

}
