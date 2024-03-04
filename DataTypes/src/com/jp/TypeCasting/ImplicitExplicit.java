package com.jp.TypeCasting;
public class ImplicitExplicit 
{
	public static void main(String[] args) 
	{
		System.out.println("Implicit Type Casting");
		byte a = 30 ;
		int b ;
		b = a;
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		
		System.out.println();
		
		System.out.println("Explicit Type Casting");
		int c = 50 ;
		byte d ;
		d = (byte) c;
		System.out.println("C : " + c);
		System.out.println("D : " + d);
	}
}