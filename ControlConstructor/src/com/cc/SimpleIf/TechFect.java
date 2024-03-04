package com.cc.SimpleIf;

import java.util.Scanner;

public class TechFect 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		int mark = scan.nextInt();
		if(mark>=70)
		{
			System.out.println("Welcome To Techfect");
		}
		scan.close();
	}
}
