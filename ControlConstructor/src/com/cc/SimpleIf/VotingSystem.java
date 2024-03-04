package com.cc.SimpleIf;
import java.util.Scanner;
public class VotingSystem 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age= scan.nextInt();
		eligibleForVote(age);
		scan.close();
	}

	private static boolean eligibleForVote(int age) 
	{
		if (age >= 18)
		{
			System.out.println("Voter Registration Eligible");
		}
		return false;
	}


}
