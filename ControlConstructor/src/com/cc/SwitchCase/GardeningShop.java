package com.cc.SwitchCase;

import java.util.Scanner;

public class GardeningShop 
{
	public static void main(String arr[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Plant Type");
		int fertilizer = scan.nextInt();
		fertilizerUse(fertilizer);
		scan.close();
	   	
	}

	private static void fertilizerUse(int fertilizer) 
	{
		switch (fertilizer)
		{
		case 1:
			System.out.println("Rose Food");
			break;
		case 2:
			System.out.println("All Purpose Fertilizer");
			break;
		case 3:
			System.out.println("Orchid Fertilizer");
			break;
		case 4:
			System.out.println("Cactus Mix");
			break;
		case 5:
			System.out.println("Organic Compost");
			break;
			
		}
		
	}

}
