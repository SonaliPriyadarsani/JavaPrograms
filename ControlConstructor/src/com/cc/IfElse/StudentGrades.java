package com.cc.IfElse;

import java.util.Scanner;

public class StudentGrades 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Your Score :");
		int score = scan.nextInt();
		markingStudentGrade(score);
		scan.close();
	}

	private static void markingStudentGrade(int score) 
	{
		if (score >=60)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
