package com.jp.DataTypesProgram;
import java.util.Scanner;
public class StudentNamePrinter 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Student's Name : ");
		String name = scan.next();
		System.out.println("The Student's Name Is : " + name);
		scan.close();
	}
}