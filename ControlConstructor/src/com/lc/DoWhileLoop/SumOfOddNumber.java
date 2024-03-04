package com.lc.DoWhileLoop;
import java.util.Scanner;
public class SumOfOddNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Range");
		int range = scan.nextInt();
		int oddSum =0;
		int i = 0 ;
		do
		{
			if(i%2==1)
			{
				oddSum = oddSum + i;
				i++;
			}
			else
			{
				i++;
			}
		}while(i<=range);
		System.out.println(oddSum);
		scan.close();
	}
}