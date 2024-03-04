package com.lc.WhileLoop;

import java.util.Scanner;

public class PowerOfNum {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Base");
		int base = scan.nextInt();
		System.out.println("Enter The Exponent");
		int exponent = scan.nextInt();
		int res = findPower(base,exponent);
		System.out.println(res);
		scan.close();
	}
	public static int findPower(int base , int exponent)
	{
		int result = (int)Math.pow(base, exponent);
		return result;
	}
}
