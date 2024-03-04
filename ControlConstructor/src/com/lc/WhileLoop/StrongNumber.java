package com.lc.WhileLoop;
import java.util.Scanner;
public class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		boolean res = findStrong(num);
		if(res==true)
		{
			System.out.println(num + " Is A Strong Number");
		}
		else
		{
			System.out.println(num + " Is Not A Strong Number");
		}
		scan.close();
	}
	static int findFactor(int digit)
	{
		 int  factor=1;
			for (int i=1;i<=digit;i++)
			{
				factor=factor*i;
			}
			return factor;
	}
	public static boolean findStrong(int num)
	{
		int digit = 0;
		int sum = 0;
		int temp = num;
		 while(temp!=0)
		 {
			 digit = temp%10;
			 sum  =sum + findFactor(digit); 
			 temp = temp/10;
		 }
		 if (sum==num)
		 {
			 return true;
		 }
		 else 
		 {
			 return false;
		 }
	}
}