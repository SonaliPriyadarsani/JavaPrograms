package com.lc.ForLoop;

import java.util.Scanner;

public class ReversedNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		int result = findReverse(num);
		System.out.println(result);
		scan.close();
	}
	public static int findReverse(int num)
	{
		int digit,sum=0;
		for(int i=num;i!=0;i=i/10)
		{
			digit= num%10;
			sum = sum*10+ digit;
			num = num/10;
		}
		return sum;
	}
}
