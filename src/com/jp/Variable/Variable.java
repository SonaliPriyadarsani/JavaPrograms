package com.jp.Variable;
public class Variable 
{
	static int staticVariable = 100 ;//Static Variable
	public static void main(String[] args)//Main Method 
	{
		 int  instanceVariable= 10 ;//Instance Variable
		 System.out.println("Instance Variable :" + instanceVariable);
		 System.out.println("Static Variable : " + staticVariable );
		 variableMethod();
	}
	public static void variableMethod() //Static Method
	{
		System.out.println();
		int localVariable = 50 ;//Local Variable
		System.out.println("Local Variable : " + localVariable);
		System.out.println("Static Variable : " + staticVariable);
	}
	
	public void nonStaticMethod() //Non-Static Method
	{
		System.out.println();
		int nSLocalVariable = 500 ;//Local Variable
		System.out.println("Non-StaticLocal Variable : " + nSLocalVariable);
		System.out.println("Static Variable : " + staticVariable);
	}
}