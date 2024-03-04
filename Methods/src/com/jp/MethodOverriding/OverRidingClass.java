package com.jp.MethodOverriding;

public class OverRidingClass {

	public static void main(String[] args) 
	{
		ParentOverRiding po = new ParentOverRiding();
		po.name = "Sankar";
		System.out.println("Parent Name : " + po.name);
		po.age = 53 ;
		System.out.println("Parent Age : " + po.age);
		po.eyeColor();
		po.hooby();
		
		System.out.println();
		
		ChildOverRiding co = new ChildOverRiding();
		co.name = "Sankar";
		System.out.println("Child Name : " + co.name);
		co.age = 13 ;
		System.out.println("Child Age : " + co.age);
		co.hooby();
	}

}
