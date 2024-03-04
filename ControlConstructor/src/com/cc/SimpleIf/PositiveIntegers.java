package com.cc.SimpleIf;
import java.util.Scanner;

public class PositiveIntegers {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int s1= scan.nextInt();
		ispositive(s1);
		scan.close();
		}

	private static boolean ispositive(int s1) 
	{
		if (s1>0)
		{
			System.out.println("Positive Number -Processing..");
		}
		return false;
	}

}

