package com.jp.ObjectClassProgram;

import java.util.Scanner;

public class CalculatorClass 
{
	Scanner scan = new Scanner(System.in);
	public void add()
	{
		System.out.println("Enter Two Number For Addition");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+b);
	}
	public int sub()
	{
		System.out.println("Enter Two Number For Substraction");
		int a = scan.nextInt();
		int b = scan.nextInt();
		return a-b;
	}
	public int mul()
	{
		System.out.println("Enter Two Number For Multiplication");
		int a = scan.nextInt();
		int b = scan.nextInt();
		return a*b;
	}
	public int div()
	{
		System.out.println("Enter Two Number For Division");
		int a = scan.nextInt();
		int b = scan.nextInt();
		return a/b;
	}
}
