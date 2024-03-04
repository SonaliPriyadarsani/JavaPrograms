package com.cc.IfElse;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int a = scan.nextInt();
		if(a>=0)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("Negative Number");
		}
		scan.close();
	}

}
