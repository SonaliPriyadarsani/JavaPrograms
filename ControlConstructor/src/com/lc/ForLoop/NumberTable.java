package com.lc.ForLoop;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		printTable(num);
		scan.close();

	}

	private static void printTable(int num) 
	{
		for( int i =1;i<=10;i++)
		{
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
	}

}
