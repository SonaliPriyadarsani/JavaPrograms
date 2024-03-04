package com.lc.ForLoop;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int num1 = scan.nextInt();
		System.out.println("Enter The Second Number");
		int num2 = scan.nextInt();
		System.out.println("The Prime Number Between " + num1 + " And " + num2 + " : ");
		for(int i=num1;i<=num2;i++)
		{
			boolean result= findPrime(i);
			if(result==true)
			{
				System.out.println(i);
			}
		}
		scan.close();
	}
	public static boolean findPrime(int i)
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
