package com.jp.Constructor;

public class FanObjecct {

	public static void main(String[] args) 
	{
		Fan f1 = new Fan("Usha" , "Black" , 900);
		System.out.println("Brand : " + f1.brand);
		System.out.println("Color : " + f1.color);
		System.out.println("Cost : " + f1.cost);
		f1.blows_Air();
		f1.rotate();
		
		System.out.println();
		
		new Fan("Puma" , "Blue" , 1020).rotate();
	}

}
