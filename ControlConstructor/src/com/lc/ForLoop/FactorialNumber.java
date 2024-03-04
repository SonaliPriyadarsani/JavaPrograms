package com.lc.ForLoop;
import java.util.Scanner;
public class FactorialNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number ");
		int num = scan.nextInt();
		printFactorialNumber(num);
        scan.close();
	}

	private static void printFactorialNumber(int num) 
	{
		long  factor=1;
		for (int i=1;i<=num;i++)
		{
			factor=factor*i;
		}
		System.out.println(factor);
	}
}