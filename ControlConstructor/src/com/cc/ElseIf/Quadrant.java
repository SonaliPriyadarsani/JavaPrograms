package com.cc.ElseIf;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Value For X And Y");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x>0 && y>0)
		{
			System.out.println("1st Quadrant");
		}
		else if(x<0 && y>0)
		{
			System.out.println("2nd Quadrant");
		}
		else if(x<0 && y<0)
		{
			System.out.println("3rd Quardent");
		}
		else if(x>0 && y<0)
		{
			System.out.println("4th Quardent");
		}
		else if(x==0 & y==0)
		{
			System.out.println("Origin Point");
		}
		else if(x==0 && y!=0)
		{
			System.out.println("Y Axis");
		}
		else if(y==0 && x>0 && x<0)
		{
			System.out.println("X Axis");
		}
		else
		{
			System.out.println("Not In The Quadrant");
		}
		scan.close();
	}

}
