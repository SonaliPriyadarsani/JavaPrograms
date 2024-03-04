package com.lc.ForLoop;

public class LabelldForLoop {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		outer : for(int i=0;i<=3;i++)
		{
			System.out.println("I : " + i);
			inner : for(int j=1;j<=2;j++)
			{
				System.out.println("J : " + j);
				if(j==2)
				{
					break outer;
				}
			}
		}
		
	}

}
