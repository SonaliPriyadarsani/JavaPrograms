package com.jp.Constructor;

public class EmployeeObject {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(123, "Sonali", 100000);
		System.out.println(e1.ssn);
		System.out.println(e1.name);
		System.out.println(e1.salary);
	}

}
