package com.jp.Methods;

import java.util.Scanner;

public class ModuralizedCode {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Number");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int res1 = sum(num1 , num2);
		System.out.println("The Sum Of Num1 And Num2 Is = " + res1);
		int res2 = sub(num1 , num2);
		System.out.println("The Substaction Of Num1 And Num2 Is = " + res2);
		int res3 = mul(num1 , num2);
		System.out.println("The Multiplication Of Num1 And Num2 Is = " + res3);
		int res4 = div(num1 , num2);
		System.out.println("The Division Of Num1 And Num2 Is = " + res4);
		int res5 = mod(num1 , num2);
		System.out.println("The Remainder Of Num1 And Num2 Is = " + res5);
		int res6 = avg(num1 , num2);
		System.out.println("The Avg Of Num1 And Num2 Is = " + res6);
		scan.close();
	}
	private static int avg(int num1, int num2) 
	{
		return (num1+num2)/2;
	}
	public static int sum(int x , int y)
	{
		return x+y;
	}
	public static int sub(int a , int b)
	{
		int sub = a -b ;
		return sub;
	}
	public static int mul(int num1 , int num2)
	{
		return num1*num2;
	}
	public static int div(int x , int y)
	{
		int division = x / y ;
		return division;
	}
	public static int mod(int p , int q)
	{
		return p%q;
	}
}
