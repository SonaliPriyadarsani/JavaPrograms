package com.lc.WhileLoop;

public class PrimeNumber {

	public boolean findPrime(int num)
	{
		if(num==0 || num==1)
		{
			return false;
		}
		else if(num==2)
		{
			return true;
		}
		else 
		{
			int i=2;
			while(i<num)
			{
				if(num%i==0)
				{
					return false;
				}
				i++;
			}
			return true;
		}
	}
}
