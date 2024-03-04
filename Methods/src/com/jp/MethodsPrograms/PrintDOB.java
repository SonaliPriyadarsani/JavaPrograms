package com.jp.MethodsPrograms;

import java.util.Scanner;

public class PrintDOB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Date : ");
		int date = scan.nextInt();
		System.out.print("Enter The Month : ");
		int month = scan.nextInt();
		System.out.print("Enter The Year : ");
		int year = scan.nextInt();
		printDOB(date ,month, year);
		scan.close();
	}
	public static void printDOB(int date , int month , int year)
	{
		System.out.println(date + " - " + month + " - " + year);
	}
}
