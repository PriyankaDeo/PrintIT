package com.printit.view;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;

public class SteelMug implements ChainHandler{
	ChainHandler successor;
	AppController appController;
	public SteelMug(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of Steel Mug");
		if (x >= 186 && y  >= 396						//Corporate Event
				&& x <= 321 && y <= 525) {
			System.out.println("**********SteelPrint************");
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
