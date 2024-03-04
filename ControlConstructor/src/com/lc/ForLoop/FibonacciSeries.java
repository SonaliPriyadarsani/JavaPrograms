package com.lc.ForLoop;
import java.util.Scanner;
public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Range");
		int range = scan.nextInt();
		printFibonacciSeries(range);
        scan.close();
	}
	private static void printFibonacciSeries(int range) 
	{
		int firstNumber,secondNumber;
		firstNumber=0;
		secondNumber=1;
		System.out.println("Fibonacci Series Till " + range + " Terms :");
		for(int i=0;i<range;i++)
		{
			System.out.println(firstNumber);
			int nextnumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=nextnumber;
		}
	}
}