package com.jp.ObjectClass;

public class TeacherObject {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.id = 100;
		t1.name = "Arun";
		t1.subject = "Java";
		System.out.println("Teacher ID : " + t1.id);
		System.out.println("Teacher Name : " + t1.name);
		System.out.println("Subject : " + t1.subject);
		t1.teach();
		t1.motivate();
		t1.giveAssignment();
	}

}
