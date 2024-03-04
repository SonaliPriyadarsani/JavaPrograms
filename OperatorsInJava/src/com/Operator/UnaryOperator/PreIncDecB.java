package com.Operator.UnaryOperator;
public class PreIncDecB 
{
	public static void main(String[] args) 
	{
		//PreIncrement
		int a = 10 ;
		System.out.println("A = " +a);
		int b;
		b = ++a;
		System.out.println("A After Increment " + a);
		System.out.println("B After Assigning With Incrementation Of A : " + b);
		
		System.out.println();
		
		//PreDecrement
		int c = 10 ;
		System.out.println("C = " +c);
		int d;
		d = --c;
		System.out.println("C After Decrement " + c);
		System.out.println("D After Assigning With Decrementation Of D : " + d);
	}
}