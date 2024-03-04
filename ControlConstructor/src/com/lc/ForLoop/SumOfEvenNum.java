package com.lc.ForLoop;
import java.util.Scanner;
public class SumOfEvenNum 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Range ");
		int range = scan.nextInt();
		int evenSum=0;
		for(int i=0;i<=range;i++)
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
		}
		System.out.println(evenSum);
		scan.close();
	}

}
