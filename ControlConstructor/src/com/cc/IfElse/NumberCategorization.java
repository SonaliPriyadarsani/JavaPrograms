package com.cc.IfElse;

import java.util.Scanner;

public class NumberCategorization 
{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
        System.out.println("Enter A Number : ");
        int num = scan.nextInt();
        categorizationNumber(num);
	    scan.close();
	}

	private static void categorizationNumber(int num)
	{
		if (num%5 ==0)
        {
        	System.out.println("Multiple Of 5");
        }
        else
        {
        	System.out.println("Not A Multiple Of 5");
        }
	}


}
