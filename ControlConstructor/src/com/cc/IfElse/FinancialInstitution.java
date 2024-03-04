package com.cc.IfElse;

import java.util.Scanner;

public class FinancialInstitution 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Your Balance Amount :");
		int amount = scan.nextInt();
		positiveAmount(amount);
		scan.close();
	}

	private static void positiveAmount(int amount) 
	{
		if (amount <0)
		{
			System.out.println("Negative Balance");
		}
		else
		{
			System.out.println("Positive Balance");
		}
		
	}

}
