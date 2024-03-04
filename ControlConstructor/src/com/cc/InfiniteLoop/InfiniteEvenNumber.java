package com.cc.InfiniteLoop;
public class InfiniteEvenNumber 
{
	public static void main(String[] args) 
	{
		int i=0;
		for(;;)
		{
			if(i%2==0)
			{
				System.out.println("Even Number" +i);
			}
			i++;
		}
	}

}
