package com.cc.SwitchCase;

import java.util.Scanner;

public class VendingMachine 
{
	public static void main(String[] args) 
	{
		Scanner Scan= new Scanner(System.in);
		 System.out.println("Enter A Product Code:");
		 int code = Scan.nextInt();
		 productCode(code);
			  Scan.close();
	}



	private static void productCode(int code) 
	{
		switch(code)
		 {
		 case 1:
			 System.out.println("Cake");
		  break;
		 case 2:
			 System.out.println("Pepsi");
		  break;
		 case 3:
			 System.out.println("Water");
		  break;
		 case 4:
			 System.out.println("Juice");
		  break;
		 case 5:
			 System.out.println("Tea");
		  break;
		  default:
		
	}
}

}
