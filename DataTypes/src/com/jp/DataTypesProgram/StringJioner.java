package com.jp.DataTypesProgram;

import java.util.Scanner;

public class StringJioner {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Strings");
		String str1 = scan.next();
		String str2 = scan.next();
		String strRes = stringJioner(str1 , str2);
		System.out.println(strRes);
		
		System.out.println();
		
		String s1 = "";
		int i = 100;
		int j = 200;
		System.out.println(i+j+s1);
		System.out.println(s1+i+j);
		System.out.println(i+s1+j);
		scan.close();
	}
	public static String stringJioner(String str1 , String str2)
	{
		return str1 + " " +  str2;
	}

}
