package com.cc.ElseIfLadder;

import java.util.Scanner;

public class WeatherAdviser {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		boolean isRaining = scan.nextBoolean() ;
		if(temp < 10)
		{
			if(isRaining)
			{
				System.out.println("Bring a coat An Umbrell");
			}
		}
		else if(temp >= 10 && temp <= 20)
		{
			
			if(isRaining)
			{
				System.out.println("Bring An Umbrella");
			}
			else
			{
				System.out.println("No special Advise is needed");
			}
		}
		else
		{
			System.out.println("Wear Light Clothing");
		}
		scan.close();
	}
}