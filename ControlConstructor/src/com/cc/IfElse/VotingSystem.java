package com.cc.IfElse;

import java.util.Scanner;

public class VotingSystem {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age = scan.nextInt();
		if(age >18)
		{
			System.out.println("Person Is Eligible For Vote");
		}
		else
		{
			System.out.println("Person Is Not Eligible For Vote");
		}
		scan.close();
	}

}
