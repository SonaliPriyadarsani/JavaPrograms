package com.lc.ForLoop;
import java.util.Scanner;
public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		int res = isPalindrome(num);
		if(res==num)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("The Number Is Not A Palindrome");
		}
		scan.close();
	}
	public static int isPalindrome(int num)
	{
		int digit=0;
		int  sum = 0;
		for(;num!=0;)
		{
			digit = num%10;
			sum = sum*10 + digit;
			num = num/10;
		}
		return sum;
	}
}