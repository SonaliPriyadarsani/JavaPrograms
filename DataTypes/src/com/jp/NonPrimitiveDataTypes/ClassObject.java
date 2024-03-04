package com.jp.NonPrimitiveDataTypes;
public class ClassObject 
{
	//Defining Variable Of A Class(Attribut)
	String name = "Sonali";
	int age = 20 ;
	
	//Defining Method Of The Class(Behavior)
	public void hobby()
	{
		System.out.println("Hobby Is Dancing");
	}
	
	public void color()
	{
		System.out.println("Color Is Black");
	}
	
	//Main Method
	public static void main(String[] args) 
	{
		//Creating Object Of A Class
		ClassObject co = new ClassObject();
		//Calling The Attribute
		System.out.println(co.name);
		System.out.println(co.age);
		//Calling The Behavior
		co.hobby();
		co.color();
	}
}