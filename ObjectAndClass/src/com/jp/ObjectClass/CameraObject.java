package com.jp.ObjectClass;

public class CameraObject {

	public static void main(String[] args) {
		Camera c1 = new Camera();
		c1.color = "Black";
		c1.brand = "Sony";
		c1.px = 25 ;
		System.out.println("Camera Color : " + c1.color);
		System.out.println("Camera Brand : " + c1.brand);
		System.out.println("Camera Px : " + c1.px);
		c1.focus();
		c1.captureImage();
		c1.displayImage();
		new Camera().displayImage();
	}

}
