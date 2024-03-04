package com.jp.ObjectClass;

public class StudentObject {

	public static void main(String[] args) 
	{
		Student so1 = new Student();
		so1.id = 101 ;
		System.out.println("Id : " + so1.id);
		so1.name = "Sonali";
		System.out.println("Name : " + so1.name);
		so1.marks = 50 ;
		System.out.println("Marks : " + so1.marks);
		so1.eat();
		so1.sleep();
		so1.study();
		
		System.out.println();
		
		
		Student so2 = new Student();
		so2.id = 102 ;
		System.out.println("Id : " + so2.id);
		so2.name = "Nikita";
		System.out.println("Name : " + so2.name);
		so2.marks = 67;
		System.out.println("Marks : " + so2.marks);
		so2.eat();
		so2.sleep();
		so2.study();
	}

}
