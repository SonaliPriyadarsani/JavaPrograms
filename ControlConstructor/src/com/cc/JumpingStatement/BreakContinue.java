package com.cc.JumpingStatement;
public class BreakContinue 
{
	public static void main(String[] args) 
	{
		for(int i =1;i<=5;i++)
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
				System.out.println("Continue");
				continue;
			}
			//System.out.println("Inside The Loop");//Compaliation Error
		}
		System.out.println("OutSide Of The ForLoop");

	}

}
