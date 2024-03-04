package com.cc.IfElseLadder;

import java.util.Scanner;

public class TrafficManagement {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int age = scan.nextInt();
		System.out.println("Enter Your EyeSightScore : ");
		int eyescore = scan.nextInt();
		PersonEligibility(age,eyescore);
		scan.close();
	}

	private static void PersonEligibility(int age, int eyescore) 
	{
		if (age>=18 )
		{
			if (eyescore >=6)
			{
				System.out.println("Driving License Eligible");	
			}
		}
		
		
	}

}
