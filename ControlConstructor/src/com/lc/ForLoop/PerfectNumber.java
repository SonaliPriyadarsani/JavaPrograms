package com.lc.ForLoop;
import java.util.Scanner;
public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = scan.nextInt();
		boolean checkPerfectNum = findPerfectNum(num);
		if(checkPerfectNum==true)
		{
			System.out.println(num + " Is A Perfect Number");
		}
		else
		{
			System.out.println(num + " Is Not A Perfect Number");
		}
		scan.close();
	}
	public static boolean findPerfectNum(int num)
	{
		int sum = 0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum = sum + i;
			}
		}
		if(num==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}