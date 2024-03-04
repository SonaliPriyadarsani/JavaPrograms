package com.lc.DoWhileLoop;

import java.util.Scanner;

public class SumOfNumDigit
{
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
		int sum =0;
		do
		{
			int digit = num%10;
			sum = sum+digit;
			num = num/10;
		}while(num>0);
		return sum;
	}

}
