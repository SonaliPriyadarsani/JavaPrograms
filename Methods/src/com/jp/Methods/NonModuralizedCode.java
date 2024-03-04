package com.jp.Methods;

import java.util.Scanner;

public class NonModuralizedCode {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Numbers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a+b ;
		System.out.println("The Addition Of A And B Is " + c);
		System.out.println("The Substraction Of A And B Is " + (a-b));
		int d = a*b ;
		System.out.println("The Multiplication Of A And B Is " + d);
		System.out.println("The Division Of A And B Is " + a/b);
		scan.close();
	}

}
