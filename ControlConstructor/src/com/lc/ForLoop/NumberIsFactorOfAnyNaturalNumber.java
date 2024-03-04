package com.lc.ForLoop;

import java.util.Scanner;

public class NumberIsFactorOfAnyNaturalNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		System.out.println("Enter A Natural Number To CheckWether It Is A Facter Of " + num + " Or Not");
		int factor = scan.nextInt();
		boolean result = findFactor(num,factor);
		if(result==true)
		{
			System.out.println(factor + " Is A Factor Of " + num);
		}
		else
		{
			System.out.println(factor + " Is Not A Factor Of " + num);
		}
		scan.close();
	}
	public static boolean findFactor(int num , int factor)
	{
		if(num%factor==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}