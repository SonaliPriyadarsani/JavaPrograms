package com.jp.DataTypesProgram;

import java.util.Scanner;

public class MinutesToSecond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt() ;
		int b  = a * 60 ;
		System.out.println(b);
		scan.close();
	}

}
