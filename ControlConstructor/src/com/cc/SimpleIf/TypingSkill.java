package com.cc.SimpleIf;

import java.util.Scanner;

public class TypingSkill
{
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter A Character");
	char ch = scan.next().charAt(0);
	if(ch == 'A' || ch == 'B' ||
			ch == 'C' || ch == 'D' ||
		    ch == 'E' || ch == 'F' ||
			ch == 'G' || ch == 'H'|| 
			ch == 'I' || ch == 'J' ||
			ch == 'K' || ch == 'L' ||
			ch == 'M' || ch == 'N' ||
			ch == 'O' || ch == 'P' ||
			ch == 'Q' || ch == 'R' ||
			ch == 'S' || ch == 'T' ||
			ch == 'U' || ch == 'V' ||
			ch == 'W' || ch == 'X' ||
			ch == 'Y' || ch == 'Z')
	{
		System.out.println("Capital Latter");
	}
	scan.close();
}
}
