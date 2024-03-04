package com.cc.IfElseLadder;

import java.util.Scanner;

public class LoanApprovalSystem 
{
	public static void main(String []arr)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int age = scan.nextInt();
		System.out.println("Enter Your Income : ");
		int income = scan.nextInt();
		eligibilityForLoan(age,income);
		scan.close();
	}

	private static void eligibilityForLoan(int age, int income) 
	{
		if (age>=18)
		{
			if (income >40000)
			{
             System.out.println("Loan Approved");
			}
		}		
	}

}
