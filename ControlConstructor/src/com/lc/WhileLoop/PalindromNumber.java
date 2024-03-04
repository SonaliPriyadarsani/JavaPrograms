package com.lc.WhileLoop;
import java.util.Scanner;
public class PalindromNumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		findPalindrome(num);
		scan.close();
	}
	public static void findPalindrome(int num)
	{
		int digit , sum = 0;
		int temp = num;
		while(num>0)
		{
			digit = num%10;
			sum = sum*10 + digit;
			num = num/10;
		}
		if(temp==sum)
		{
			System.out.println("The Number Is A Palindrome");
		}
		else 
		{
			System.out.println("The Number Is Not A Palindrome");
		}
	}
}