package com.spike80.iphone_classes.browser;

public class Browser implements InterfaceBrowser {

	@Override
	public void showingPage() {
		System.out.println("Showing Page");		
	}

	@Override
	public void addNewPage() {
		System.out.println("New Page added");
	}

	@Override
	public void refreshPage() {
		System.out.println("Done!");
	}

}
