package com.lc.ForLoop;

import java.util.Scanner;

public class SumOfNumDigit {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		int res = findSumOfDigit(num);
		System.out.println(res);
		scan.close();
	}

	private static int findSumOfDigit(int num) 
	{
		int digit = 0 ;
		int sum=0;
		for(int i=num;i!=0;i=i/10)
		{
			digit = num %10;			
			sum = sum+digit;
			num = num/10;
		}
		return sum;
	}

}
