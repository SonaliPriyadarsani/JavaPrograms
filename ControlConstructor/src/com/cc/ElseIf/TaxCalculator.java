package com.cc.ElseIf;
import java.util.Scanner;
public class TaxCalculator 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int income = scan.nextInt();
		double tax = 0 ;
		if(income <= 10000)
		{
			tax = income * 0.5 ;
		}
		else if(income >=10001 && income <= 20000)
		{
			tax = income * 0.1 ;
		}
		else if(income >= 20001 && income <= 50000)
		{
			tax = income * 0.15 ;
		}
		else
		{
			tax = income * 0.2 ;
		}
		System.out.println(tax);
		scan.close();
	}
}