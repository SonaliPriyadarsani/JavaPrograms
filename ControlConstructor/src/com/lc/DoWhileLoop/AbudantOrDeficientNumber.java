package com.lc.DoWhileLoop;
import java.util.Scanner;
public class AbudantOrDeficientNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		boolean res = cheackAbudantOrDeficientNum(num);
		if(res==true)
		{
			System.out.println(num + " Is An Abudant Number");
		}
		else
		{
			System.out.println(num + " Is A Deficient Number");
		}
		scan.close();
	}
	public static boolean cheackAbudantOrDeficientNum(int num)
	{
		int sum = 0;
		int i=1;
		do 
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
		}
		while(i<num);
		if(sum>num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
