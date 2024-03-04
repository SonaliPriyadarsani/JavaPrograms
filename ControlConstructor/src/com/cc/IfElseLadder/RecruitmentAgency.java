package com.cc.IfElseLadder;
import java.util.Scanner;
public class RecruitmentAgency {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Years Of Experience ");
		int s1 = scan.nextInt();
		System.out.println("Enter Your Skill Level");
		int s2 = scan.nextInt();
		candidateJobRole(s1,s2);
        scan.close();
	}

	private static void candidateJobRole(int s1, int s2) 
	{
		if (s1>5)
		{
			if(s2>7)
			{
				System.out.println("Suitable Candidate");
			}
		}
		
	}

}
