package com.Operator.UnaryOperator;
public class UnaryOperator 
{
	public static void main(String[] args) 
	{
		int a = 5 ;
		boolean b = true ;
		System.out.println("A : " + a);
		System.out.println("Unary Plus : " + (+a));
		System.out.println("Unary Minus : " + (-a));
		System.out.println("Unary Increment : " + (++a));
		System.out.println("Unary decrement : " + (--a));
		System.out.println("Logical Not : " + (!b));
		System.out.println("Bitwise Not : " + (~a));
	}
}