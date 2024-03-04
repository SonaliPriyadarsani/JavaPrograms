package com.jp.MethodsPrograms;
import java.util.Scanner;
public class SwapNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int a = scan.nextInt();
		System.out.println("Enter The Second Number");
		int b = scan.nextInt();
		System.out.println("Before Swapping");
		System.out.println("A : " + a + " B : " + b);
		swapWT(a , b);
		
		System.out.println();
		
		System.out.println("Enter The First Number");
		int x = scan.nextInt();
		System.out.println("Enter The Second Number");
		int y = scan.nextInt();
		swapUT(x,y);
		scan.close();
	}
	public static void swapWT(int a , int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swaping");
		System.out.println("A : " + a + " B : " + b);
	}
	public static void swapUT(int a , int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swaping");
		System.out.println("A : " + a + " B : " + b);
	}
}