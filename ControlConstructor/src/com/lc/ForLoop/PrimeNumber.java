package com.lc.ForLoop;
import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = scan.nextInt();
		findPrimeNumber(num);
		scan.close();
	}
	private static void findPrimeNumber(int num) 
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num + " Is A prime Number");
		}
		else
		{
			System.out.println(num + " Is Not A Prime");
		}
		
	}
}