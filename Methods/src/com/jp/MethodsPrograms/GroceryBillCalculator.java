package com.jp.MethodsPrograms;

import java.util.Scanner;

public class GroceryBillCalculator {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int p1 = scan.nextInt();
		int p2 = scan.nextInt();
		int p3 = scan.nextInt();
		int result = printSum(p1 , p2 , p3);
		System.out.println(result);
		scan.close();
	}
	public static int printSum(int p1 , int p2 , int p3)
	{
		return p1 + p2 + p3 ;
	}
}