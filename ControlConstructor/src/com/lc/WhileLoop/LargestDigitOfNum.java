package com.lc.WhileLoop;

import java.util.Scanner;

public class LargestDigitOfNum {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num = scan.nextInt();
		findLargestDigit(num);
		scan.close();
	}

	private static void findLargestDigit(int num) 
	{
		int digit = 0;
		int largestNum = 0;
		while (num >0)
		{
			digit = num%10;
			if(largestNum<digit)
			{
				largestNum = digit ;
			}
			num = num/10;
		}
		System.out.println("The Largest Digit Is " + largestNum);
	}

}
