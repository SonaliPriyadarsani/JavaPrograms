package com.cc.IfElse;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = scan.nextInt();
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
		scan.close();
	}
}