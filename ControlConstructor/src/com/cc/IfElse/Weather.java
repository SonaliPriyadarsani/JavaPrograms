package com.cc.IfElse;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Weather Condition");
		int weather = scan.nextInt();
		if(weather>=80)
		{
			System.out.println("Weather Is Hot Stay Inside");
		}
		else
		{
			System.out.println("Weather Is Pleasant .Let's Go For A Walk!");
		}
		scan.close();
	}

}
