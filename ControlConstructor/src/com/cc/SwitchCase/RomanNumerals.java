package com.cc.SwitchCase;

import java.util.Scanner;

public class RomanNumerals 
{
	public static void main(String[] args) 
	{
		Scanner Scan= new Scanner(System.in);
		 System.out.println("Enter A Roman Numerical:");
		 String roman = Scan.nextLine();
		 romanNumerals(roman);
			  Scan.close();
	}
	private static void romanNumerals(String roman) 
	{
		switch(roman)
		 {
		 case "I":
			 System.out.println("1");
		  break;
		 case "II":
			 System.out.println("2");
		  break;
		 case "III":
			 System.out.println("3");
		  break;
		 case "IV":
			 System.out.println("4");
		  break;
		 case "V":
			 System.out.println("5");
		  break;
	}
}

}
