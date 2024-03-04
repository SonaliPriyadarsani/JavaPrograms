package com.cc.ElseIf;
import java.util.Scanner;
public class MinimumMark 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Three Marks Of A Student");
		int mark1 = scan.nextInt();
		int mark2 = scan.nextInt();
		int mark3 = scan.nextInt();
		if(mark1<mark2 && mark1<mark3)
		{
			System.out.println(mark1);
		}
		else if(mark2<mark1 && mark2<mark3)
		{
			System.out.println(mark2);
		}
		else
		{
			System.out.println(mark3);
		}
		scan.close();
	}

}
