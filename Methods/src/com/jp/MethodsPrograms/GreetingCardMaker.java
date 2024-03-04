package com.jp.MethodsPrograms;
import java.util.Scanner;
public class GreetingCardMaker 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		printGreeting(s1 , s2);
		scan.close();
	}
	public static void printGreeting(String s1 , String s2)
	{
		System.out.println(s1  + " , " + s2  );
	}
}