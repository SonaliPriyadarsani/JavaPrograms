package com.jp.ObjectClass;

public class Calculator {
	public static void addition(int a , int b)
	{
		int sum = a+b;
		System.out.println("Addition " + sum);
	}
	public void substraction(int a , int b)
	{
		int sub = a-b;
		System.out.println("Substraction : " + sub);
	}
	public static void multiplication(int a , int b)
	{
		System.out.println("Multiplication : " + (a*b));
	}
	public static void division(int a , int b)
	{
		int div = a/b;
		System.out.println("Division : " + div);
	}
	public static int modulos(int a , int b)
	{
		return a%b;
	}
}
