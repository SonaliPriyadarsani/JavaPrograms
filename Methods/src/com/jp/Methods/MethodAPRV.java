package com.jp.Methods;

import java.util.Scanner;

public class MethodAPRV {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int x = scan.nextInt();
		System.out.println("Enter Second Number : ");
		int y = scan.nextInt();
		int result = mul(x,y);
		System.out.println("The Multiplication Of Two Number Is "  + result);
		scan.close();
	}
	public static int mul(int x , int y)
	{
		return x*y ;
	}
}
