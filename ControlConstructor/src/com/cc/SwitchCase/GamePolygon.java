package com.cc.SwitchCase;

import java.util.Scanner;

public class GamePolygon {

	public static void main(String[] args) 
	{
		Scanner Scan= new Scanner(System.in);
		 System.out.println("Enter A Number Of Sides Of A Polygon:");
		 int sides = Scan.nextInt();
		 sidesOfPolygon(sides);
			  Scan.close();
	}
	private static void sidesOfPolygon(int sides) 
	{
		switch(sides)
		 {
		 case 3:
			 System.out.println("Triangle");
		  break;
		 case 4:
			 System.out.println("Quadrilateral");
		  break;
		 case 5:
			 System.out.println("Pentagon");
		  break;
		 case 6:
			 System.out.println("Hexagon");
		  break;
		 case 7:
			 System.out.println("Heptagon");
		  break;
		 case 8:
			 System.out.println("Octagon");
		  break;
		
	}
}
}
