package com.jp.Constructor;

public class FanCObject {

	public static void main(String[] args) 
	{
		FanC f1 = new FanC();
		f1.brand = "Compton";
		System.out.println("Brand : " + f1.brand);
		f1.color = "Black";
		System.out.println("Color : " + f1.color);
		f1.cost = 2330;
		System.out.println("Cost : " + f1.cost);
		f1.blows_Air();
		f1.rotate();
		
		System.out.println();
		
		new FanC().rotate();;
	}

}
