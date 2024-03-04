package com.cc.SwitchCase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter + , - , * , / To Perform Arithmatic Operation");
		char c = scan.next().charAt(0);
		switch(c)
		{
		case '+' :
			System.out.println("Enter Two Number To Perform Addition");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Addition Of Two Number Is " + (a+b));
			break;
		case '-' :
			System.out.println("Enter Two Number To Perform Substraction");
			int x = scan.nextInt();
			int y = scan.nextInt();
			System.out.println("Substraction Of Two Number Is " + (x-y));
			break;
		case '*' :
			System.out.println("Enter Two Number To Perform Multiplication");
			int m = scan.nextInt();
			int u = scan.nextInt();
			System.out.println("Multiplication Of Two Number Is " + (m*u));
			break;
		case '/' :
			System.out.println("Enter Two Number To Perform Division");
			int d = scan.nextInt();
			int i = scan.nextInt();
			System.out.println("Division Of Two Number Is " + (d/i));
			break;
		default :
			System.out.println("Idiot Plz Look To The Message Properly !");
		scan.close();
		}
	}
}
