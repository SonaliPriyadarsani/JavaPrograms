package com.lc.WhileLoop;
import java.util.Scanner;
public class AbudantAndDeficientNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		boolean res = cheackAbudantOrDeficient(num);
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
	public static boolean cheackAbudantOrDeficient(int num)
	{
		int sum = 0;
		int i=1;
		while(i<num)
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
			i++;
		}
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