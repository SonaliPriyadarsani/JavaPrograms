package com.cc.JumpingStatement;

public class Continue {

	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("I : " + i);
			if(i==2)
			{
				continue;
			}
			System.out.println("Inside The For Loop");
		}
		System.out.println("Outside The For Loop");
	}

}
