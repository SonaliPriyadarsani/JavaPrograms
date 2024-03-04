package com.jp.MethodOverloading;

public class MOverloading {
	public static int sum(int a , int b)
	{
		return a+b;
	}
	public static int sum(int a , int b , int c)
	{
		return a+b+c ;
	}
	public static void sub(int a , int b)
	{
		int c = a-b ;
		System.out.println("Subtraction Of Two Number Is : " + c);
	}
	public static void sub(int a , int b , int c)
	{
		int d = a-b ;
		int e = d-c ;
		System.out.println("Subtraction Of Number Is : " + e);
	}
	public static void mul(int a , int b)
	{
		int c = a*b ;
		System.out.println("Multiplication " + c);
	}
	public static int div(int a , int b)
	{
		return a/b ;
	}
	public static void main(String[] args) {
		int a = 4 ;
		int b = 4 ;
		int c = 4;
		int res = sum(a , b);
		System.out.println("Sum Of Two Number : " + res);
		int res1 = sum( a , b , c);
		System.out.println("Sum Of Three Number : " + res1);
		System.out.println();
		sub(15 , 5);
		sub(30 , 5 , 5);
		System.out.println();
		mul(a , b);
		System.out.println();
		int res3 = div(a , b);
		System.out.println("Division : " + res3);
	}

}
