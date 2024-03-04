package com.lc.ForLoop;

import java.util.Scanner;

public class SumOfNturalNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scan.nextInt();
		sumNumber(num);
		scan.close();
	}

	private static void sumNumber(int num) 
	{
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
