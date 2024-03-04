package com.lc.DoWhileLoop;

import java.util.Scanner;

public class PageReader {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		boolean board ;
		int i = 1 ;
		do {
			System.out.println("Read Page " + i);
			i++;
			System.out.println("Are You Bored");
			board = scan.nextBoolean();
		}
		while(board == false);
		scan.close();
		
	}

}
