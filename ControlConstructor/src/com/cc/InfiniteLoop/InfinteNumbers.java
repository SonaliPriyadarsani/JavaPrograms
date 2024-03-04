package com.cc.InfiniteLoop;
public class InfinteNumbers 
{
	public static void main(String[] args) 
	{
		int i=1;
		for(;;)
		{
			if(i == 20000)
			{
				break;
			}
			else if(i != 10000)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}