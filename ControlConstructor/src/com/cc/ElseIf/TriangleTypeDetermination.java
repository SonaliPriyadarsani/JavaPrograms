package com.cc.ElseIf;

import java.util.Scanner;

public class TriangleTypeDetermination {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int side1 = scan.nextInt();
		int side2 = scan.nextInt();
		int side3 = scan.nextInt();
		if(side1 == side2  && side2== side3)
		{
			System.out.println("Equilateral");
		}
		else if( side1 == side2 || side2 == side3 || side1 == side3 )
		{
			System.out.println("Isosceles");
		}
		else
		{
			System.out.println("Scalene");
		}
		scan.close();
	}
}