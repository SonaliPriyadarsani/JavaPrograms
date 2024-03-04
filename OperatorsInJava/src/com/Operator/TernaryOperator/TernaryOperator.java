package com.Operator.TernaryOperator;
public class TernaryOperator 
{
	public static void main(String[] args) 
	{
		int a = 10 ;
		int b = 5 ;
		String result = (a > b) ? "A Is Greater Then B" : "A Is Less Then OR Equals To B";
		System.out.println(result);
		
		System.out.println();
		
		int x = 20 ;
		int y = (x == 20) ? 60 : 90 ;
		System.out.println(y);
		int z = (x == 1) ? 60 : 90 ;
		System.out.println(z);
	}
}