package com.lc.DoWhileLoop;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		findSumDigit(num);
		scan.close();
	}

	private static void findSumDigit(int num) 
	{
		int digit =0;
		int singleDigit =0;
		int sum =0;
		int SingleSum=0;
		do
		{
			digit = num%10;
			sum = sum + digit ;
			num = num/10;
		}
		while(num>0);
		 System.out.println("Sum Of Number Digit : " + sum);
		do 
		{
			singleDigit = sum%10;
			SingleSum = SingleSum + singleDigit;
			sum = sum /10;
		}
		while(sum>0);
		System.out.println("Sum Of Sum Digit "+SingleSum);
	}

}
