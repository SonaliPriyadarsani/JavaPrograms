package com.lc.WhileLoop;

import java.util.Scanner;

public class PrimeNumberObject {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		PrimeNumber pn = new PrimeNumber();
		boolean isPrime = pn.findPrime(num);
		if(isPrime==true)
		{
			System.out.println("Prime Number");
		}
		else 
		{
			System.out.println("Not A Prime Number");
		}
		scan.close();
	}
}
