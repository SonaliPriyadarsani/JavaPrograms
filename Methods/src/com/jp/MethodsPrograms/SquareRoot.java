package com.jp.MethodsPrograms;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		int squareRoot = (int)findSquare(num);
		scan.close();
		System.out.println("The Square Root Of " + num + "=" + squareRoot);
	}

	private static double findSquare(int num) 
	{
		double squareRoot = Math.sqrt(num);
		System.out.println(Math.pow(2, 3));
		return squareRoot;
		
	}

}
