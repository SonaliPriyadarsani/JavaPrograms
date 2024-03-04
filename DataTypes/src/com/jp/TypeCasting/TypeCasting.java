package com.jp.TypeCasting;
public class TypeCasting 
{
	public static void main(String[] args) 
	{
		//Implicit Casting (Automatically Done By Java )
		int i = 50 ;
		double d = i ;
		System.out.println("Double Variable After Implicit Casting : " + d);
		
		System.out.println();
		
		
		//Explicit Casting (Needs To Be Done By The Programmer)
		int myint = (int)d;
		System.out.println("MyInt After Explicit Casting : " + myint);
	}
}