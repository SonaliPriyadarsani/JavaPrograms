package com.jp.Methods;

import java.util.Scanner;

public class MethodNARV {

	public static void main(String[] args) 
	{
		int result =mul();
		System.out.println("Mul : " + result);
	}
	public static int mul()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Number For Multiplication");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a * b;
		scan.close();
		return c ;
	}

}
