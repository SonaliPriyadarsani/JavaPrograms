package com.lc.ForLoop;

import java.util.Scanner;

public class SmallestDigit {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		int res = findSmallestDigit(num);
		System.out.println(res);
		scan.close();
	}

	private static int findSmallestDigit(int num) 
	{
		int digit =0;
		int smallestDigit = num%10;
		for(int i=0;i<=num;i++)
		{
			digit = num%10;
			if(digit<smallestDigit)
			{
				smallestDigit = digit;
			}
			num = num/10;
		}
		return smallestDigit;
	}

}
