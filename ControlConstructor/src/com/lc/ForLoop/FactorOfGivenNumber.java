package com.lc.ForLoop;

import java.util.Scanner;

public class FactorOfGivenNumber {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		findFactor(num);
		scan.close();
	}
	public static void findFactor(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i + " ");
			}
		}
	}
}
