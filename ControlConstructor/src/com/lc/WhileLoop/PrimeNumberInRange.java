package com.lc.WhileLoop;
import java.util.Scanner;
public class PrimeNumberInRange 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int a = scan.nextInt();
		System.out.println("Enter The Second Number");
		int b = scan.nextInt();
		System.out.println("The Prime Number Betwwen " + a + " And " + b + " : ");
		int i = a;
		while(i<=b)
		{
			PrimeNumber pn = new PrimeNumber();
			boolean res = pn.findPrime(i);
			if(res==true)
			{
				System.out.println(i);
			}
			i++;
		}
		scan.close();
	}

}