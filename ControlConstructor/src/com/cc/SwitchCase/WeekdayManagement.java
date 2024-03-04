package com.cc.SwitchCase;

import java.util.Scanner;

public class WeekdayManagement 
{
	public static void main(String[] args) 
	{
		Scanner Scan= new Scanner(System.in);
		 System.out.println("Enter A  Week Day Number:");
		 int num = Scan.nextInt();
		 weekDayNum(num);
			  Scan.close();
	}
	private static void weekDayNum(int num) 
	{
		switch(num)
		 {
		 case 1:
			 System.out.println("Monday");
		  break;
		 case 2:
		 System.out.println("Tuesday");
		 break;
		 case 3:
			 System.out.println("Wednesday");
		  break;
		 case 4:
			 System.out.println("Thursday");
		  break;
		 case 5:
			 System.out.println("Friday");
		  break;
		 case 6:
			 System.out.println("Saturday");
		  break;
		 case 7:
			 System.out.println("Sunday");
		  break;
		 }
	}

}
