package com.lc.WhileLoop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scan.nextInt();
		reverse(num);
		scan.close();
	}

	private static void reverse(int num) 
	{
		int digit;
		while(num>0)
		{
			digit=num%10;
			System.out.print(digit);
			num=num/10;
		}
	}

}
