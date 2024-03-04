package com.lc.ForLoop;

import java.util.Scanner;

public class SumOfNaturalNumberGivenRange {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scan.nextInt();
		System.out.println("Enter Last Number");
		int b = scan.nextInt();
		int sumOfNaturalNumber = findSumOfNaturalNumber(a ,b);
		System.out.println(sumOfNaturalNumber);
		scan.close();
	}
	public static int findSumOfNaturalNumber(int a , int b)
	{
		int sum = 0;
		for(int i=a;i<=b;i++)
		{
			sum = sum+i;
		}
		return sum;
	}
}
