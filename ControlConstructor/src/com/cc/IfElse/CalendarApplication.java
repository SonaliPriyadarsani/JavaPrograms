package com.cc.IfElse;

import java.util.Scanner;

public class CalendarApplication 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Year");
		int year = scan.nextInt();
		identifyLeapYears(year);
		scan.close();
	}

	private static void identifyLeapYears(int year)
	{
		if (year%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Non-Leap Year");
		}	
	}
	
}
