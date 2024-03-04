package com.jp.MethodsPrograms;

import java.util.Scanner;

public class SwapingPhoneNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		swapTwoNumber(a , b);
		scan.close();
	}
	public static void swapTwoNumber(int a, int b)
	{
		a = a*b;
		b = a / b ;
		a = a/b ;
		System.out.println(a);
		System.out.println(b);
	}
}
