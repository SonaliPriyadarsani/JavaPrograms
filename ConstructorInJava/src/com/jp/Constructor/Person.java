package com.jp.Constructor;

public class Person {
	int  id;
	String name;
	String gender;
	String email_id;
	long phone_No;
	public Person(int id, String name, String gender, String email_id, long phone_No) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email_id = email_id;
		this.phone_No = phone_No;
	}
	void eat()
	{
		System.out.println(name + " Is Sleeping");
	}
	void sleep()
	{
		System.out.println( gender + " "+ name + " Is Sleeping");
	}
}
