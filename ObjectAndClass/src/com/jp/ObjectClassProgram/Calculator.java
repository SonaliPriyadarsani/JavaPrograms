package com.jp.ObjectClassProgram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		CalculatorClass cc = new CalculatorClass();
		while(true)
		{
			System.out.println("Choose One Of The One To Perform Arithmatic Operation");
			System.out.println("Enter + For Addition");
			System.out.println("Enter - For Substraction");
			System.out.println("Enter * For Multiplication");
			System.out.println("Enter / For Division");
			System.out.println("Enter & For Exit");
			char choice = scan.next().charAt(0);
			switch(choice)
			{
			case '+' :
				cc.add();
				break;
			case '-' :
				System.out.println(cc.sub());
				break;
			case '*' : 
				System.out.println(cc.mul());
				break;
			case '/' : 
				System.out.println(cc.div());
				break;
			case '&' :
				System.exit(choice);
			default :
				System.out.println("See The Message Properly");
			scan.close();
			}
		}	
	}
	
}