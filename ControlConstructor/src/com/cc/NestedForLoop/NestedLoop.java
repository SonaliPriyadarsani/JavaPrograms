package com.cc.NestedForLoop;

public class NestedLoop {

	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("I : " + i);
			for(int j=1;j<=2;j++)
			{
				System.out.println("J : " + j);
			}
		}
	}

}
