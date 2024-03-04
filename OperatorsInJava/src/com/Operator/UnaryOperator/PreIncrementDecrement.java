package com.Operator.UnaryOperator;
public class PreIncrementDecrement 
{
	public static void main(String[] args) 
	{
		//Pre Increment
		int a = 10 ;
		System.out.println("A  Before Increment");
		System.out.println(a);
		++a;
		System.out.println("A After Increment");
		System.out.println(a);
		
		System.out.println();
		
		//Pre Decrement
		int b = 10 ;
		System.out.println("B  Before Decrement");
		System.out.println(b);
		--b;
		System.out.println("B After Decrement");
		System.out.println(b);
	}
}