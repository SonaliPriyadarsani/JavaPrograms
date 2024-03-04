package com.cc.SwitchCase;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number From 1 To 7");
		int day = scan.nextInt();
		switch(day)
		{
		case 1 :
			System.out.println("Super Sunday");
			break;
		case 2 :
			System.out.println("Boring Monday");
			break;
		case 3 :
			System.out.println("Extraordinary Tuesday");
			break;
		case 4 :
			System.out.println("Fabulos Wednesdauy");
			break;
		case 5 :
			System.out.println("Peaceful Thursday");
			break;
		case 6 :
			System.out.println("Exitment Friday");
			break;
		case 7 :
			System.out.println("Laziness Sunday");
			break;
		default :
			System.out.println("Idiot Plz Look To The Message Properly !");
		scan.close();
	}

  }
}
