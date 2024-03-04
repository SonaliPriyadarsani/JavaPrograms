package com.lc.ForLoop;
import java.util.Scanner;
public class AbundantNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		boolean res = cheackAbundantNum(num);
		if(res==true)
		{
			System.out.println(num + " Is An Abundant Number");
		}
		else
		{
			System.out.println(num + " Is A Deficient Number");
		}
		scan.close();
	}
	public static boolean cheackAbundantNum(int num)
	{
		int sum =0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
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