package com.Operator.BinaryOperator;
public class AssignmentOperator 
{
	public static void main(String[] args) 
	{
		int a = 20 ;
		System.out.println("A : " + a);
		a += 5 ;
		a -= 3 ;
		a *= 2 ;
		a /= 6 ;
		a %= 3 ;
		System.out.println("After Assignment A Is " + a);
		
		System.out.println();
		
		int b = 10 ;
		System.out.println("B : " + b);
		System.out.println("B += 5 = " + (b += 5));
		System.out.println("B -= 3 = " + (b -= 3));
		System.out.println("B *= 2 = " + (b *= 2));
		System.out.println("B /= 6 = " + (b /= 6));
		System.out.println("B %= 3 = " + (b %= 3));
	}
}