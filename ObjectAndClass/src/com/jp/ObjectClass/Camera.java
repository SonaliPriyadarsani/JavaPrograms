package com.jp.ObjectClass;

public class Camera {
	String color;
	String brand ;
	int px ;
	void focus()
	{
		System.out.println( brand + " Adjusting The Focus");
	}
	void captureImage()
	{
		System.out.println("Click Click " + px);
	}
	void displayImage()
	{
		System.out.println("See The Image");
	}
}
