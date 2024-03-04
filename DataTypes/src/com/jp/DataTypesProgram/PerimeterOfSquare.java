package com.jp.DataTypesProgram;

import java.util.Scanner;

public class PerimeterOfSquare 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int side = scan.nextInt() ;
		int perimeter = 4 * side ;
		System.out.println(perimeter);
		scan.close();
	}
}