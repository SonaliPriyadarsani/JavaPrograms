package com.lc.WhileLoop;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Range");
		int range = scan.nextInt();
		int res = sumOfEvenNum(range);
		System.out.println(res);
		scan.close();
	}

	private static int sumOfEvenNum(int range) 
	{
		int evensum =0;
		int i=0;
		while(i<=range)
		{
			if(i%2==0)
			{
				evensum = evensum+i;
				i++;
			}
			else
			{
				i++;
			}
		}
		return evensum;
	}

}
