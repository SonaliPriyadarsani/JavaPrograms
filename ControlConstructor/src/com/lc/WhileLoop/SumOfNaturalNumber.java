package com.lc.WhileLoop;

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
		int sum =0;
		int i=0;
		while(i<=range)
		{
			sum = sum + i;
			i++;
		}
		return sum;
	}

}
