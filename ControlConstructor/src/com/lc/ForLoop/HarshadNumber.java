package com.lc.ForLoop;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		boolean res = cheackHarsadNumber(num);
		if(res==true)
		{
			System.out.println(num + " Is A Harsad Number");
		}
		else
		{
			System.out.println(num + " Is Not An Harsad Number ");
		}
		scan.close();
	}
	public static boolean cheackHarsadNumber(int num)
	{
		int original = num;
		int sum = 0;
		int digit = 0;
		for(;num!=0;)
		{
			digit = num%10;
			sum = sum + digit;
			num = num/10;
		}
		if(original%sum == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}