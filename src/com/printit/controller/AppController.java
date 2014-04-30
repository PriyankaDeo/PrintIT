package com.printit.controller;
/*
import com.event.view.CharityScreen;
import com.event.view.CorporateScreen;
import com.event.view.HomeScreen;
import com.event.view.KeyPad;
import com.event.view.MapScreen;
import com.event.view.MixEventScreen;
import com.event.view.MusicScreen;
import com.event.view.PinScreen;
import com.event.view.ReceiptScreen;
import com.event.view.SportsScreen;
import com.event.controller.IScreen;
*/
import com.printit.view.HomeScreen;
import com.printit.view.PinScreen;
import com.printit.view.UploadScreen;

import processing.core.PApplet;

public class AppController extends PApplet{

	private static final long serialVersionUID = 1L;
	
	IScreen pinScreen;
	IScreen homeScreen;
	IScreen sportsScreen;
	IScreen musicScreen;
	//IScreen corporateScreen;
	//IScreen charityScreen;
	IScreen currentScreen;
	//IScreen receiptScreen;
	//IScreen mapScreen;
	//IScreen mixEventScreen;
	IScreen mugPrint;
	IScreen uploadScreen;
	double cost;
	
	
	
	public AppController(){
		pinScreen = new PinScreen(this);
		homeScreen = new HomeScreen(this);
		uploadScreen=new UploadScreen(this);
		currentScreen = pinScreen;
		
		setCurrentScreen(pinScreen);
	}
	
	
	
	public void setup() {

		currentScreen.setup(this);
	}


	@Override
	public void mousePressed() {

		currentScreen.mousePressed(this);
		currentScreen.draw(this);
	}

	public IScreen getCurrentScreen() {

		return currentScreen;
	}
	
	public void setCurrentScreen(IScreen currentScreen) {

		this.currentScreen = currentScreen;
	}
	
	public void draw(){
		
		currentScreen.draw(this);
	}

	public IScreen getPinScreen() {

		return pinScreen;
	}

	public void setPinScreen(IScreen pinScreen) {
		this.pinScreen = pinScreen;
	}
	
	public IScreen getUploadScreen(){
		return uploadScreen;
	}
	
	public void serUploadScreen(IScreen uploadScreen){
		this.uploadScreen=uploadScreen;
	}

	
	public IScreen getHomeScreen() {

		return homeScreen;
	}

	public void setHomeScreen(IScreen homeScreen) {
		this.homeScreen = homeScreen;
	}


	
}
