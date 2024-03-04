package com.cc.IfElseLadder;

import java.util.Scanner;

public class FeatureGame
{
	public static void main(String arr[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Gold Coins");
		int coins = scan.nextInt();
		System.out.println("Enter A Player Level");
		int playerlevel = scan.nextInt();
		System.out.println("The Player  Has A Special Key");
		String skey = scan.next();
		foundSpecialItem(coins,playerlevel,skey);
		scan.close();
	}

	private static void foundSpecialItem(int coins, int playerlevel, String skey) 
	{
		if (coins >10)
		{
			if (playerlevel > 5)
			{
				if (skey == "true")
				{
					System.out.println("Special Item Found");
				}
			}
		}
	}
	
}
