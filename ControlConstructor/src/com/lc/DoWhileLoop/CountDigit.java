package com.lc.DoWhileLoop;
import java.util.Scanner;
public class CountDigit 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = scan.nextInt();
		int res = countDigit(num);
		System.out.println(res);
		scan.close();
	}

	private static int countDigit(int num) {
		int digit =0;
		do
		{
			digit++;
			num = num/10;
		}
		while(num>0);
		return digit;
	}
}