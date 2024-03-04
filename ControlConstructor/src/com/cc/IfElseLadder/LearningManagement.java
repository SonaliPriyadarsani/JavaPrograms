package com.cc.IfElseLadder;
import java.util.Scanner;
public class LearningManagement 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter Score Of First Test ");
		int test1=scan.nextInt();
		System.out.println(" Enter Score Of Second Test ");
		int test2=scan.nextInt();
		System.out.println(" Enter Score Of Third Test ");
		int test3=scan.nextInt();
		int avg=(test1+test2+test3)/3;
		checkPerformance(test1,test2,test3, avg);
        scan.close();		
	}

	private static void checkPerformance(int test1, int test2, int test3 , int avg) 
	{
		if (test1 > 50)
		{
			if(test2 > 50)
			{
				if(test3 > 50)
				{
					System.out.println("Passed All");
				}
			}
		}
		else if (avg>50)
		{
			System.out.println("Average Score Passed");
		}	
	}
}