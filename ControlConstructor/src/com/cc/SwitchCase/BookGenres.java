package com.cc.SwitchCase;
import java.util.Scanner;
public class BookGenres
{
	public static void main(String arr[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Genre Number");
		int genre = scan.nextInt();
		printgenre(genre);
		scan.close();
	}

	private static void printgenre(int genre) 
	{
		switch (genre)
		{
		case 1:
			System.out.println("Fiction");
			break;
		case 2:
			System.out.println("Non-Fiction");
			break;
		case 3:
			System.out.println("Fantasy");
			break;
		case 4:
			System.out.println("Mystery");
			break;
		case 5:
			System.out.println("Biography");
			break;
			
		}
		
	}

}
