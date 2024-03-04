package com.jp.MethodsPrograms;

import java.util.Scanner;

public class AreaRectangular {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Length Of The Rectangular");
		double length = scan.nextDouble();
		System.out.println("Enter Width Of The Length");
		double width = scan.nextDouble();
		double res = findArea(length , width);
		System.out.println(res);
		scan.close();
	}

	private static double findArea(double length, double width) 
	{
		return length*width;
	}

}
