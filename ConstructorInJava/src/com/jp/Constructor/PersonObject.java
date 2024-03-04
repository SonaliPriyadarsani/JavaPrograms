package com.jp.Constructor;
import java.util.Scanner;
public class PersonObject
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Id : ");
		int id = scan.nextInt();
		System.out.println("Enter Your Name : ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("Enter Your Gender : ");
		String gender = scan.nextLine();
		System.out.println("Enter Your Email_ID : ");
		String email_id = scan.next();
		System.out.println("Enter Phone Number ");
		long phone_No = scan.nextLong();
		Person p1 = new Person(id, name, gender, email_id, phone_No);
		System.out.println("Id : " + id 
				+ " Name : " +
				name + " Gender : " +
				gender + " Email_Id : " +
				 email_id +
				" Phone Number : " + phone_No);
		p1.eat();
		p1.sleep();
		scan.close();
	}
}