package com.jp.MethodsPrograms;

import java.util.Scanner;

public class MultiplyExact {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int a = scan.nextInt();
		System.out.println("Enter The Second Number");
		int b = scan.nextInt();
		int result = mul(a , b);
		System.out.println("Multiplication : " + result);
		scan.close();
	}
	public static int mul(int a , int b)
	{
		int product = Math.multiplyExact(a, b);
		return product;
	}
}
