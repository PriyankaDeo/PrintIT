package com.printit.view;
import processing.core.*;

public class MugPrintScreen extends PApplet{

	PImage img1;
	PImage img2;
	PImage img3;
	PImage img4;
	public void setup() {
		size(220,350);
		background(450);
		img1 = loadImage("ceramicmug.jpg");
		img2= loadImage("plasticmug.jpg");
		img3= loadImage("glassmug.jpg");
		img4= loadImage("steelmug.jpg");
	}
	 
	public void draw(){
		  
		  image(img1, 25,43);
		  image(img2, 125,43);
		  image(img3, 125,218);
		  image(img4, 25,218);
	}
	

}
