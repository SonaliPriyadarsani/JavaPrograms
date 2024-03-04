package com.cc.SimpleIf;

import java.util.Scanner;

public class RollerCoaster 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age= scan.nextInt();
		allowedAge(age);
		scan.close();
		}

	private static boolean allowedAge(int age) 
	{
		if (age >= 0)
		{
			System.out.println("Ride Access Granted");
		}
		return false;
	}

    
}