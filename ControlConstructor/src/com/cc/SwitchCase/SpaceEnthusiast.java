package com.cc.SwitchCase;
import java.util.Scanner;
public class SpaceEnthusiast
{
	public static void main(String arr[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter A Planet Name ");
		String planetName = scan.nextLine();
		findOrder(planetName);
		scan.close();
	}

	private static void findOrder( String planetName) 
	{
		switch (planetName)
		{
		case "Mercury":
			System.out.println("1");
			break;
		case "Venus":
			System.out.println("2");
			break;
		case "Earth":
			System.out.println("3");
			break;
		case "Mars":
			System.out.println("4");
			break;
		case "Jupiter":
			System.out.println("5");
			break;
		case "Saturn":
			System.out.println("6");
			break;
		case "Uranus":
			System.out.println("7");
			break;
		case "Neptune":
			System.out.println("8");
			break;
	}

	}
}
