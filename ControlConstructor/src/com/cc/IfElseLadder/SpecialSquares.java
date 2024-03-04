package com.cc.IfElseLadder;

import java.util.Scanner;

public class SpecialSquares {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Length Of Side 'a' :  ");
		int a = scan.nextInt();
		System.out.println("Enter The Length Of Side 'b' : ");
		int b = scan.nextInt();
		boolean c = (a==b);
		int num = scan.nextInt();
		int sqrt = (int)Math.sqrt(num);
		System.out.println(sqrt*sqrt == num);
        squareChecker(a,b,c,num);
        scan.close();
	}

	private static void squareChecker(int a, int b, boolean c, int num) 
	{
		if (c = (a==b))
		{
		 if (num == 0)
		 {
			 System.out.println("Majic");
		 }
		}
		
	}

}
