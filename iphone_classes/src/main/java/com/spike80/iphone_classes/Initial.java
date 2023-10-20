package com.spike80.iphone_classes;

import com.spike80.iphone_classes.router.Router;
import com.spike80.iphone_classes.browser.*;
import com.spike80.iphone_classes.phone.*;
import com.spike80.iphone_classes.player.*;

public class Initial {

	public static void main(String[] args) {
		
		System.out.println("\nBrowser:\n _______________________\n");
		
		Router router = new Router();
		router.showingPage();
		router.addNewPage();
		router.refreshPage();
		
		Browser browser = new Browser();
		browser.showingPage();
		browser.addNewPage();
		browser.refreshPage();
		
		System.out.println("\nMusic Player:\n _______________________\n");
		router.playMusic();
		router.pauseMusic();
		router.selectMusic();
		
		Player player = new Player();
		player.playMusic();
		player.pauseMusic();
		player.selectMusic();
		
		System.out.println("\nPhone:\n _______________________\n");
		router.call();
		router.pickUp();
		router.voiceMail();
		
		Phone phone = new Phone();
		phone.call();
		phone.pickUp();
		phone.voiceMail();
		
		
		
		
		

	}

}
