package com.lc.ForLoop;

import java.util.Scanner;

public class FriendlyOrAmicableNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Two Number ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int sum1 = cheackFriendlyNum(num1);
		int sum2 = cheackFriendlyNum(num2);
		int res1 = sum1/num1;
		int res2 = sum2/num2;
		if(res1==res2)
		{
			System.out.println(num1 + " And " + num2 + " Is A Friendly Number");
		}
		else
		{
			System.out.println(num1 + " And " + num2 + " Is Not A Friendly Number");
		}
		scan.close();
	}
	public static int cheackFriendlyNum(int num)
	{
		int sum = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
		}
		return sum;
	}
}
