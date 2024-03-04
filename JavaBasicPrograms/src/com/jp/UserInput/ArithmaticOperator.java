package com.jp.UserInput;

import java.util.Scanner;

public class ArithmaticOperator 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The First Number ");
		int num1 = scan.nextInt();
		System.out.println("Enter The Second Number ");
		int num2 = scan.nextInt();
		int sum = num1 + num2 ;
		System.out.println("Addition Of Num1 And Num2 Is : " + sum);
		int sub = num1 - num2 ;
		System.out.println("Substraction Of Num1 And Num2 Is : " + sub);
		System.out.println("Multiplication Of Num1 And Num2 Is : " + num1*num2);
		int div = num1/num2 ;
		System.out.println("Division Of Num1 And Num2 Is : " + div);
		System.out.println("Modules Of Num1 And Num2 is " + (num1%num2));
		scan.close();
	}
}