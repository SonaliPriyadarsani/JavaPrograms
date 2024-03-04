package com.jp.DataTypesProgram;
public class DataTypeInJava 
{
	public static void main(String[] args) 
	{
		//Return Type Is Double
		int num1 = 10 ;
		System.out.println("Num1 : " + num1);
		double num2 = 3.14 ;
		System.out.println("Num2 : " + num2);
		double result = (num1 + num2);
		System.out.println("Addition Of Two Number Is " + result);
		
		System.out.println("---------------");
		
		//Return Type Is Integer
		int num3 = 5 ;
		System.out.println("Num3 : " + num3);
		int result1 = num1 / num3 ;
		System.out.println("Division Of Two Number Is " + result1);

		System.out.println("---------------");
		
		
		//Return Type Is String
		String s1 = "Hello" ;
		System.out.println("The String Variable Is : " + s1);
		String result2 = s1 + num1 ;
		System.out.println("Addition Of Int Number And String Type Is : " + result2);
		
		System.out.println("-----------------");
		
		//Return Type Is Boolean 
		boolean bool = true ;
		System.out.println("Boolean value Of Bool Is : " + bool);
		boolean bool1 = false ;
		System.out.println("Boolean Value Of Bool1 Is : " + bool1); 
		boolean result3 = bool && bool1 ;
		System.out.println("Bool && Bool1 " + result3);
	}
}