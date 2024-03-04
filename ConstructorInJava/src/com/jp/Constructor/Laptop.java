package com.jp.Constructor;

public class Laptop 
{
	String brand ;
	String color ;
	int cost;
	void do_operation()
	{
		System.out.println(brand +" " + color +  " Colored Laptop Whicch Costs " + cost + " Is Doing Processing" );
	}
	public Laptop(String a, String b, int c) {
		brand = a;
		color = b;
		cost = c;
	}
	
}
