package com.cc.SimpleIf;

import java.util.Scanner;

public class RetailStore
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Total Purchase Amount ");
		int amount= scan.nextInt();
		discountPolicy(amount);
		scan.close();
		}

	private static boolean discountPolicy(int amount) 
	{
		if (amount>200)
		  {
			  System.out.println("Discount Of 20% Applicable");
		  }
		return false;
	}
}
