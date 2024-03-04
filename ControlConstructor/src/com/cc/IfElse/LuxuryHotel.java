package com.cc.IfElse;

import java.util.Scanner;

public class LuxuryHotel 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Your Age :");
		int age = scan.nextInt();
		seniorCitizenDiscount(age);
        scan.close();	
	}

	private static void seniorCitizenDiscount(int age)
	{
		if (age >=60)
		{
			System.out.println("Senior Citizen Discount Applicable");
		}
		else
		{
			System.out.println("Regular Charges Applicale");
		}
	}
}
