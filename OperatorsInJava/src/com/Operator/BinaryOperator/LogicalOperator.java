package com.Operator.BinaryOperator;
public class LogicalOperator 
{
	public static void main(String[] args) 
	{
		boolean a = true ;
		boolean b = false ;
		System.out.println("And Result : " + (true && true));
		System.out.println("A && B : " + (a && b));
		System.out.println("And Result : " + (true &&  false));
		System.out.println("B && A : " + (b && a));
		System.out.println("OR Result : " + (a || b));
		System.out.println("OR Result : " + (b || a));
		System.out.println("Not Result For A " + (!a));
		System.out.println("Not Result For B " + (!b));
		
		System.out.println("---------");
		
		int c = 10 ;
		int d = 15 ;
		boolean  e = (c+c == 20) && (d*3 == 45);
		System.out.println("The Result Is : " + e);
	}
}