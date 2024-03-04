package com.cc.ElseIfLadder;

import java.util.Scanner;

public class GymMembershipFee {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age < 18)
		{
			System.out.println("30");
		}
		else if(age > 18 && age <=65)
		{
			String membershipType = scan.next();
			if(membershipType.equals("Standard"))
			{
				System.out.println("50");
			}
			else if(membershipType.equals("Premium"))
			{
				System.out.println("80");
			}
		}
		else
		{
			System.out.println("40");
		}
		scan.close();
	}

}
