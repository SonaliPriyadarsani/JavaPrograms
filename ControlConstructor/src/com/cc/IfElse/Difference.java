package com.cc.IfElse;

import java.util.Scanner;

public class Difference 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Number For Substraction");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a<b)
		{
			System.out.println("Substraction : " + (b-a));
		}
		else
		{
			System.out.println("Substraction : " + (a-b));
		}
		scan.close();
	}
}
