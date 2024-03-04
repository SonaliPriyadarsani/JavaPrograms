package com.lc.ForLoop;
import java.util.Scanner;
public class AutoMorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = scan.nextInt();
		boolean res = cheackAutoMorphicNum(num);
		if(res==true)
		{
			System.out.println(num + " Is An AutoMorphic Number ");
		}
		else
		{
			System.out.println(num + " Is Not An AutoMorphic Number ");
		}
		scan.close();
	}
	public static boolean cheackAutoMorphicNum(int num)
	{
		int square = num * num;
		for(;num!=0;)
		{
			if(num%10!=square%10)
			{
				return false;
			}
			num = num/10;
			square = square/10;
		}
		return true;
	}
}