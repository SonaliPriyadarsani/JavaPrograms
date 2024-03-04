package com.jp.Constructor;

public class Fan {
	String brand ;
	String color ;
	int cost;
	void blows_Air()
	{
		System.out.println(brand + " Fan Is Blowing Air");
	}
	void rotate()
	{
		System.out.println(brand + " " + color + " Fan Is Rotating");
	}
	public Fan(String a , String b , int c )
	{
		brand = a;
		color = b;
		cost = c;
	}
}
