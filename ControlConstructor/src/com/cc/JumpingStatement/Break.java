package com.cc.JumpingStatement;

public class Break {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println("I : " + i);
			if(i==3)
			{
				System.out.println("Break");
				break;
			}
			else
			{
				System.out.println("Else Block");
			}
			System.out.println("Inside The Loop");
		}
		System.out.println("OutSide Of The ForLoop");
	}

}
