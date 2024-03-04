package com.cc.IfElse;
import java.util.Scanner;
public class PositiveNumber
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number To Cheak Positive Or Negative");
		int num = scan.nextInt();
		boolean  isPositiveNum =isPositiveNum(num);
		if(isPositiveNum == true)
		{
			System.out.println("The Number Is Positive Number");
		}
		else
		{
			System.out.println("The Number Is Negative Number");
		}
       scan.close();
	}

	private static boolean isPositiveNum(int num) 
	{
		if(num>0)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
}
