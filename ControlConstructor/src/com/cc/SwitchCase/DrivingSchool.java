package com.cc.SwitchCase;

import java.util.Scanner;

public class DrivingSchool {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Traffic Light Color ");
		String color = scan.next();
		printAction(color);
		scan.close();

	}

	private static void printAction(String color) 
	{
		switch (color)
		{
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
				
		}
		
	}

}
