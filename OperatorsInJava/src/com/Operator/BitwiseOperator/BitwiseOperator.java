package com.Operator.BitwiseOperator;
public class BitwiseOperator 
{
	public static void main(String[] args) 
	{
		int a = 9 ;
		System.out.println("A : " + a);
		int b = 8 ;
		System.out.println("B : " + b);
		
		System.out.println();
		
		System.out.println("Bitwise And");
		System.out.println("The Value Of A & B Is " + (a & b));
		
		System.out.println();
		
		System.out.println("Bitwise OR");
		System.out.println("The Value Of A | B Is " + (a | b));
		
		System.out.println();
		
		System.out.println("Bitwise Exclusive oR ");
		System.out.println("The Value Of A ^ B Is " + (a ^ b));
		
		System.out.println();
		
		System.out.println("Bitwise Complement");
		System.out.println("The Value Of ~A Is " + (~a));
		System.out.println("The Value Of ~B Is " + (~b));
		
		boolean bool = true ;
		System.out.println("A : " + a);
		boolean bool1 = false ;
		System.out.println("B : " + b);
		
		System.out.println();
		
		System.out.println("Bitwise And");
		System.out.println("The Value Of A & B Is " + (bool & bool1));
		
		System.out.println();
		
		System.out.println("Bitwise OR");
		System.out.println("The Value Of A | B Is " + (bool | bool1));
		
		System.out.println();
		
		System.out.println("Bitwise Exclusive oR ");
		System.out.println("The Value Of A ^ B Is " + (bool ^ bool1));
	}
}