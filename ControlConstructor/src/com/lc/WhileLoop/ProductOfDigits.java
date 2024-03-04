package com.lc.WhileLoop;
import java.util.Scanner;
public class ProductOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		countOfDigit(num);
		scan.close();
	}
	private static void countOfDigit(int num) 
	{
		int digit=0 ,product=1 ;
		while(num>0)
		{
		  digit = num%10;
		  product = product * digit;
		  num = num/10;
		}
		System.out.println(product);
	}

}
