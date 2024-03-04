package com.jp.UserInput;
import java.util.Scanner;
public class LogicalOperator 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Boolean Value ");
		boolean bool1 = scan.nextBoolean();
		boolean bool2 = scan.nextBoolean();
		System.out.println("AND Result : " + (bool1 && bool2));
		System.out.println("AND Result : " + (bool2 && bool1));
		System.out.println("OR Result : " + (bool1 || bool2));
		System.out.println("OR Result : " + (bool2 || bool1));
		System.out.println("Not Result For Bool1 : " + (!bool1));
		System.out.println("Not Result For Bool2 : " + (!bool2));
		scan.close();
	}
}