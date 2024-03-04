package com.jp.Methods;

import java.util.Scanner;

public class MethodAPNR {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The First Number : ");
		int a = scan.nextInt();
		System.out.println("Enter The Second Number : ");
		int b = scan.nextInt();
		sum(a,b);
		scan.close();
	}

	private static void sum(int a, int b) 
	{
		int c = a+b;
		System.out.println("The Sum Of A And B Is : " + c);
	}

}
