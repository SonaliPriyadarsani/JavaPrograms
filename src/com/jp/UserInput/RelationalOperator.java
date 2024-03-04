package com.jp.UserInput;

import java.util.Scanner;

public class RelationalOperator 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Value For A ");
		int a = scan.nextInt();
		System.out.println("Enter The Value For B ");
		int b = scan.nextInt();
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		System.out.println("A Equals To B : " + (a==b));
		System.out.println("A Not Equlas To B : " + (a!=b));
		System.out.println("A Greater Then B : " + (a > b));
		System.out.println("B Greater Then A : " + (b > a));
		System.out.println("A Smaller Then B : " + (a < b));
		System.out.println("B Smaller Then A : " + (b < a));
		System.out.println("A Greater Then Equlas To B : " + (a>=b));
		System.out.println("A Smaller Then Equals To B : " + (a<=b));
		scan.close();
	}

}
