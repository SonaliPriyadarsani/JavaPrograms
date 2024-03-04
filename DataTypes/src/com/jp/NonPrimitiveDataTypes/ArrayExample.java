package com.jp.NonPrimitiveDataTypes;

import java.util.Scanner;

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int arr[];
		System.out.println("Enter The Size Of The Array : ");
		arr = new int[scan.nextInt()];
		for(int i=0;i <= arr.length-1;i++)
		{
			System.out.println("Enter The " +(i+1) + " Elements : ");
			arr[i] = scan.nextInt();
		}
		System.out.println("Array Elements");
		for(int i =0;i <= arr.length-1;i++)
		{
			System.out.print(arr[i] + " , ");
		}
		scan.close();
	}
}