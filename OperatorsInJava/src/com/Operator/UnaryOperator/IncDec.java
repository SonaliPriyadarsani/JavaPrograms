package com.Operator.UnaryOperator;
public class IncDec 
{
	public static void main(String[] args) 
	{
		int a = 10 ;
		System.out.println("A = " + a);
		int b ;
		b = a-- + --a + a++ ;
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		
		System.out.println();
		
		int c = 10 ;
		System.out.println("C = " + c);
		int d ;
		d = --c + c++ + --c + c-- + c++ ;
		System.out.println("C : " + c);
		System.out.println("D : " + d);
		
        System.out.println();
		
		int x = 10 ;
		System.out.println("X = " + x);
		int y ;
		y = x++ + ++x + --x + x-- + --x + --x + x-- + x++ + x++ + x++ + ++x + x++ ;
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
	}
}