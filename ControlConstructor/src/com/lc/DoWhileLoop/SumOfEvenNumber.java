package com.lc.DoWhileLoop;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Range");
		int range = scan.nextInt();
		int evenSum=0;
		int i=0;
		do 
		{
			if(i%2==0)
			{
				evenSum = evenSum + i;
				i++;
			}
			else
			{
				i++;
			}
		}while(i<=range);
		System.out.println(evenSum);
		scan.close();
	}

}
