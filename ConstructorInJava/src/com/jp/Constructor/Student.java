package com.jp.Constructor;

public class Student {
	String name ;
	int age ;
	int marks ;
	
	public Student(String name, int age, int marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public boolean isPassing()
	{
		return marks > 60 ;
	}
}
