package com.jp.ObjectClass;
import java.util.Scanner;
public class MessageDecoder 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Character");
		char ch = scan.next().charAt(0);
		System.out.println(MessageDecoderClass.decodeMessage(ch));
		scan.close();
	}
}
