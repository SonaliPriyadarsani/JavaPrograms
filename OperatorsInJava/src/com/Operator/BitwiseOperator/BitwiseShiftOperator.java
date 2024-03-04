package com.Operator.BitwiseOperator;
public class BitwiseShiftOperator 
{
	public static void main(String[] args) 
	{
		int a = 256 ;
		System.out.println("A : " + a);
		
		System.out.println();
		
		System.out.println("Bitwise Right Shift Operator");
		int b = (a>>4);
		System.out.println("After Right Shift A Is " + b);
		
		System.out.println();
		
		System.out.println("Bitwise Left Shift operator");
		int c = (a << 1);
		System.out.println("After Left Shift A IS " + c);
		
		System.out.println();
		
		System.out.println("Bitwise Unsigned RightShift");
		int d = (a>>>1);
		System.out.println("After Unsigned RightShift A Is " + d);
	}
}