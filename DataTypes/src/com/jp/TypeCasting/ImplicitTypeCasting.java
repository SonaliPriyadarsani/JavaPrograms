package com.jp.TypeCasting;

import java.util.Scanner;

public class ImplicitTypeCasting 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		byte a = scan.nextByte() ;
		short b = a ;
		int c = a;
		long l = a ;
		System.out.println(b);
		System.out.println(c);
		System.out.println(l);
		scan.close();
	}
}