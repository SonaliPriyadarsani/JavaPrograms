package com.lc.ForLoop;
import java.util.Scanner;
public class FindGCD 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Number ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		printGCD(num1,num2);
        scan.close();
	}

	private static void printGCD(int num1, int num2) 
	{
		int gcd=1;
		for (int i=1;i<=num1 && i<=num2;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println( "GCD Of Num1 and Num2 is : "  + gcd);
	}
}