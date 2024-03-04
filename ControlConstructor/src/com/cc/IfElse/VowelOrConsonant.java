package com.cc.IfElse;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Character");
		char ch = scan.next().charAt(0);
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'||ch == 'i' || ch == 'I' ||ch == 'o' || ch == 'O'||ch == 'u' || ch == 'U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
		scan.close();
	}

}
