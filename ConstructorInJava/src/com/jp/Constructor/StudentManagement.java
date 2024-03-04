package com.jp.Constructor;

public class StudentManagement {

	public static void main(String[] args) {
		Student s1 = new Student("Sonali", 17 , 67);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.marks);
		boolean b = s1.isPassing();
		String s = b ? "pass" : "Fail" ;
		System.out.println(s);
	}
	
}
