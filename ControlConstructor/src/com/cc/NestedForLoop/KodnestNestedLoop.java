package com.cc.NestedForLoop;

public class KodnestNestedLoop {

	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("I : " + i);
			for(int j=1;j<=3;j++)
			{
				if(j==2)
				{
					break;
				}
				System.out.println("J : " + j);
				System.out.println("Kodnest");
			}
		}
	}

}
