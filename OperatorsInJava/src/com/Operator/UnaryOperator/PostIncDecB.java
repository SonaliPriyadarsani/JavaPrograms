package com.Operator.UnaryOperator;
public class PostIncDecB 
{
	public static void main(String[] args) 
	{
		//PosttIncrement
		int a = 10 ;
		System.out.println("A = " +a);
		int b;
		b = a++;
		System.out.println("A After Increment " + a);
		System.out.println("B After Assigning With Incrementation Of A : " + b);
		
		System.out.println();
		
		//PostDecrement
		int c = 10 ;
		System.out.println("C = " +c);
		int d;
		d = c--;
		System.out.println("C After Decrement " + c);
		System.out.println("D After Assigning With Decrementation Of D : " + d);
	}
}