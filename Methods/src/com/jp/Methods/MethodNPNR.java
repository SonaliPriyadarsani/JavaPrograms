package com.jp.Methods;

import java.util.Scanner;

public class MethodNPNR {

	public static void main(String[] args) 
	{
		sum();
	}

	private static void sum() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int a = scan.nextInt();
		System.out.println("Enter The Second Number");
		int b = scan.nextInt();
		System.out.println("The Addition Of A And B Is : " + (a+b));
		scan.close();
	}

}
