package com.cc.NestedForLoop;

public class Kodnest {

	public static void main(String[] args) 
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("I : " + i);
			for(int j=0;j<=3;)
			{
				System.out.println("Kodnest");
				break;
			}
		}
	}

}
