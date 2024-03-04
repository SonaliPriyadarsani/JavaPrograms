package com.jp.Printf;

import java.util.Scanner;

public class PrintF {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Number For Division");
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		double res = div(num , num2);
		System.out.printf("%.2f\n",res);
		scan.close();
	}

	private static double div(int num, int num2) {
		return num/num2;
	}

}
