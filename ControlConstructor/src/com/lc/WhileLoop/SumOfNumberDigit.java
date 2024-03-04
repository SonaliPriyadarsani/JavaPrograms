package com.lc.WhileLoop;

import java.util.Scanner;

public class SumOfNumberDigit {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		int res = sumOfNumDigit(num);
		System.out.println(res);
		scan.close();
	}

	private static int sumOfNumDigit(int num) 
	{
		int sum =0;
		int digit = 0;
		while(num !=0)
		{
			digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		return sum;
	}

}
