package com.lc.WhileLoop;

import java.util.Scanner;

public class SumOfOddNum {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Range");
		int range = scan.nextInt();
		sumOfOddNum(range);
		scan.close();
	}

	private static void sumOfOddNum(int range) 
	{
		int sum = 0;
		int i=0;
		while(i<=range)
		{
			if(i%2==1)
			{
				sum = sum + i;
				i++;
			}
			else
			{
				i++;
			}
			
		}
		System.out.println(sum);
	}

}
