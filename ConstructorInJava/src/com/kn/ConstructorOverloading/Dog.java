package com.kn.ConstructorOverloading;

public class Dog {
	String name ;
	int age ;
	String breed;
	String color;
	void eat()
	{
		System.out.println(name + " Dog Is Eating");
	}
	void sleep()
	{
		System.out.println(name + " " + color + " Dog Is Sleeping");
	}
	void bark()
	{
		System.out.println("Angry " + name + " " + color + " Dog Which Aged " + age + " Years Is Barking");
	}
	public Dog()
	{
		name = "Rumi";
		age = 10;
		breed = "Bull";
		color = "Black";
	}
	public Dog(String a)
	{
		name = a;
		age = 9;
		breed = "Gp";
		color = "White";
	}
	public Dog(int a)
	{
		name = "Soni";
		age = a;
		breed = "Sp";
		color = "Red";
	}
	public Dog(String a , int b)
	{
		name = a;
		age = b;
		breed = "Mu";
		color = "Pink";
	}
	public Dog(String a , String c)
	{
		name = a;
		age = 3;
		breed = c;
		color = "Yellow";
	}
	public Dog(int b ,String a)
	{
		name = a;
		age = b;
		breed = "Sp";
		color = "Green";
	}
	public Dog(String a , int b , String c)
	{
		name = a;
		age = b;
		breed = c;
		color = "Red";
	}
	public Dog(int b , String c , String d)
	{
		name = "kimi";
		age = b;
		breed = c;
		color = d;
	}
	public Dog(String a , String c , int b)
	{
		name = a;
		age = b;
		breed = c;
		color = "Blue";
	}
	public Dog(String a , String c , String d)
	{
		name = a;
		age = 6;
		breed = c;
		color = d;
	}
	public Dog(String a , int b , String c , String d)
	{
		name = a;
		age = b;
		breed = c;
		color = d;
	}
	public Dog(int b , String a , String c , String d )
	{
		name = a;
		age = b;
		breed = c;
		color = d;
	}
	public Dog(String a , String c , int b , String d)
	{
		name = a;
		age = b;
		breed = c;
		color = d;
	}
	public Dog(String a , String c , String d , int b)
	{
		name = a;
		age = b;
		breed = c;
		color = d;
	}
}
