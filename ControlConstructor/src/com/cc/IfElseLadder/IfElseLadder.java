package com.cc.IfElseLadder;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) 
	{
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter A Positive Number ");
				int num= scan.nextInt();
				if(num>0)
				{
					if(num%2==0)
					{
						System.out.println("Num " + num + " Is Even Number");
					}
					else
					{
						System.out.println("Num " + num + " Is Odd Number");
					}
				}
				else
				{
					System.out.println("Plz! See Message Properly");
				}
				scan.close();

	}
}
