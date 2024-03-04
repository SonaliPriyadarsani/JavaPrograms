package com.jp.Constructor;

public class Employee 
{
	int ssn;
	String name;
	int salary;
	/*
	public Employee(int a ,String b , int c)
	{
		ssn = ssn;
		name = name;
		salary = salary;
	}
	*/
	public Employee(int ssn, String name, int salary) {
		this.ssn = ssn;
		this.name = name;
		this.salary = salary;
	}
	
}
