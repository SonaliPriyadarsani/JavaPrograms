package com.jp.ObjectClass;

import java.util.Scanner;

public class CalculatorObject 
{
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Number To Perform Arithmatic Operation : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		Calculator.addition(a, b);
		cal.substraction(a, b);
		Calculator.multiplication(a, b);
		Calculator.division(a, b);
		int res = Calculator.modulos(a, b);
		System.out.println("Reminder : " + res);
		scan.close();
	}
}