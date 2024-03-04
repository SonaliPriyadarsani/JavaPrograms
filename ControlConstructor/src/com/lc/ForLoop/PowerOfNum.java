package com.lc.ForLoop;
import java.util.Scanner;
public class PowerOfNum 
{
	public static void main(String[] args) 
	{
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter The Base");
		int base = scan.nextInt();
		System.out.println("Enter The Exponent");
		int exponent = scan.nextInt();
		int res = calculatepower (base,exponent);
		System.out.println(res);
		scan.close();

	}
	private static int calculatepower(int base, int exponent) 
	{
		int power =1;
		for(int i =1;i<=exponent;i++)
		{
			power =power *base;
		}
		return power;
	}
}