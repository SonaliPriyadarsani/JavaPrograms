package com.lc.ForLoop;

import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Range");
		int range = scan.nextInt();
		int oddSum = 0;
		for(int i=0;i<=range;i++)
		{
			if(i%2==1)
			{
				oddSum = oddSum + i;
				i++;
			}
		}
		System.out.println(oddSum);
		scan.close();
	}

}
