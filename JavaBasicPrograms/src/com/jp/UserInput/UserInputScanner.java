package com.jp.UserInput;

import java.util.Scanner;

public class UserInputScanner
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Integer Number");
		//Byte
		System.out.println("Byte");
		System.out.println("Enter The Value For A : ");
		byte a = scan.nextByte();
		System.out.println("Enter The Value For B : ");
		byte b = scan.nextByte();
		System.out.println("The Addition Of A And B Is = " + (a+b));
		
		System.out.println();
		
		
		//Short
		System.out.println("Short");
		System.out.println("Ente The Value For C : ");
		short c = scan.nextShort();
		System.out.println("Enter The Value For D : ");
		short d = scan.nextShort();
		System.out.println("The Substraction Of C And D Is = " + (c-d));
		
		
		System.out.println();
		
		
		//Int
		System.out.println("Int");
		System.out.println("Enter The Value For E : ");
		int e = scan.nextInt();
		System.out.println("Enter The Value For F : ");
		int f = scan.nextInt();
		System.out.println("The Multiplication Of E And F Is = " + (e*f));
		
		
		System.out.println();
		
		
		//Long
		System.out.println("Long");
		System.out.println("Enter The Value For G : ");
		long g = scan.nextLong();
		System.out.println("The Value Of G Is = " + g);
		
		System.out.println();
		
		System.out.println("Real Number");
		//Float
		System.out.println("Float");
		System.out.println("Enter The Value For H : ");
		float h = scan.nextFloat();
		System.out.println("Enter The Value For I : ");
		float i = scan.nextFloat();
		System.out.println("The Division Of H And I Is = " + (h*i));
		
		System.out.println();
		
		//Double
		System.out.println("Double");
		System.out.println("Enter The Value For J : ");
		double j = scan.nextDouble();
		System.out.println("The Value Of J Is = " + j);
		
		System.out.println();
		
		
		//Char
		System.out.println("Character");
		System.out.println("Enter The Value For K : ");
		char k = scan.next().charAt(0);
		System.out.println("The Value Of K Is = " + k);
		
		System.out.println();
		
		
		//String
		System.out.println("String");
		System.out.println("Enter Your Name : ");
		String name = scan.next();
		System.out.println("Name : " + name );
		scan.nextLine();
		System.out.println("Enter Your InstaID : ");
		String instaId = scan.nextLine();
		System.out.println("Insta Id : " + instaId);
		scan.close();
	}
}