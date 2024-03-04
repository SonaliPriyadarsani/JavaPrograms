package com.lc.DoWhileLoop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Decimal Number");
		int num = scan.nextInt();
		decimalToBinary(num);
		
		scan.close();
	}

	private static void decimalToBinary(int num) {
		do 
		{
			String findBinary = Integer.toBinaryString(num);
			System.out.println(findBinary);
			break;
		}
		while(num>0);
	}

}
