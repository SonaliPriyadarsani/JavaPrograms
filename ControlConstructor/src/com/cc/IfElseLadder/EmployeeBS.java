package com.cc.IfElseLadder;

import java.util.Scanner;

public class EmployeeBS
{
	public static void main (String arr[] )
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Years Of Service");
		int yearofservice = scan.nextInt();
		System.out.println("Monthly Targets Met");
		int targetsmet = scan.nextInt();
		printgenre(yearofservice , targetsmet);
		scan.close();
	}

	private static void printgenre(int yearofservice, int targetsmet) 
	{
		if (yearofservice >3 )
		{
			if (targetsmet >6)
			{
				System.out.println("Bonus Eligible");
			}
		}
		
	}

}
