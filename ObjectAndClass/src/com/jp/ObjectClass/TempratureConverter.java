package com.jp.ObjectClass;

import java.util.Scanner;

public class TempratureConverter {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Temprature In F");
		float f = scan.nextFloat();
		TempratureConverterClass tc = new TempratureConverterClass();
		System.out.printf("%.2f" , tc.convertFtoC(f));
		scan.close();
	}

}
