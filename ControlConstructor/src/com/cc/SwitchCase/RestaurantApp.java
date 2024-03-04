package com.cc.SwitchCase;
import java.util.Scanner;
public class RestaurantApp
{
	public static void main(String arr[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Day Of The Week ");
		int day = scan.nextInt();
		specialDish(day);
		scan.close();
	}

	private static void specialDish(int day) 
	{
		switch(day)
		{
		case 1:
			System.out.println("Pasta");
			break;
		case 2:
			System.out.println("Tacos");
			break;
		case 3:
			System.out.println("Sushi");
			break;
		case 4:
			System.out.println("Steak");
			break;
		case 5:
			System.out.println("Pizza");
			break;
		case 6:
			System.out.println("Lobster");
			break;
		case 7:
			System.out.println("Brunch");
			break;
		}
		
	}

}
