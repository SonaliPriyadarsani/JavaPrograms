package com.cc.IfElseLadder;
import java.util.Scanner;
public class TicketPriceCalculation
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Age : ");
		int age = scan.nextInt();
		System.out.println("Movie Type : ");
		String movieType = scan.next();
		if(age <= 12)
		{
			if(movieType.equals("matinee"))
			{
				System.out.println("7");
			}
			else
			{
				System.out.println("10");
			}
		}
		else
		{
			if(movieType.equals("matinee"))
			{
				System.out.println("10");
			}
			else
			{
				System.out.println("15");
			}
		}
		scan.close();
	}
}