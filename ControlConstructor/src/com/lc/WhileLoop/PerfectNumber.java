package com.lc.WhileLoop;
import java.util.Scanner;
public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num= scan.nextInt();
		isPerfectNumber(num);
		scan.close();
	}
	private static void isPerfectNumber(int num) 
	{
		int sum=0,i=1;
		while(i<num)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==num)
		{
			System.out.println("Number Is A Perfect Number");
		}
		else
		{
			System.out.println("Number Is  Not A Perfect Number");
		}
	}
}