package com.printit.view;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;

public class PlasticMug implements ChainHandler{
	ChainHandler successor;
	AppController appController;
	public PlasticMug(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of Plastic Mug");
		if (x >= 196 && y  >= 218						//Corporate Event
				&& x <= 299 && y <= 320) {
			System.out.println("**********PlasticPrint************");
			appController.setCurrentScreen(appController.getUploadScreen());
		}
		else{
			if (successor != null){
				successor.handleRequest(x, y);
			}
			else{
				System.out.println("Not my req");
			}
		}
		
	}

	@Override
	public void setSuccessor(ChainHandler next) {
		// TODO Auto-generated method stub
		this.successor = next;
	}

}
