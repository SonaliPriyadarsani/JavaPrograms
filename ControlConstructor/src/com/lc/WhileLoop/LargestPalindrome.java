package com.lc.WhileLoop;
import java.util.Scanner;
public class LargestPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number As A Range");
		int range = scan.nextInt();
		 findLargestpalindrome(range);		
		scan.close();
	}

	private static void findLargestpalindrome(int range) 
	{
		int i = range;
		while (i>= 1)
		{
			if(isPalindrome(i))
			{
				System.out.println("The Largest Palindrome Is "+ i + " With The Range " + range);
				break;
			}
			i--;
		}
	}
	static boolean isPalindrome(int num)
	{
		int digit,sum=0,temp=num;
		while(num>0)
		{
			digit = num%10;
			sum = sum*10 + digit;
			num = num/10;
		}
		if (temp == sum)
		{
			return true;
		}
		return false;
	}

}
