package com.lc.DoWhileLoop;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Range");
		int range = scan.nextInt();
		int res = sumOfNaturalNum(range);
		System.out.println(res);
		scan.close();
	}

	private static int sumOfNaturalNum(int range) 
	{
		int sum = 0;
		int i= 0;
		do
		{
			sum = sum + i;
			i++;
		}while(i<=range);
		return sum;
	}

}
