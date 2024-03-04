package com.jp.DataTypesProgram;

import java.util.Scanner;

public class BankTransactions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long l1 = scan.nextLong();
		long l2 = scan.nextLong();
		long totalAmount = l1 + l2 ;
		System.out.println("Total Money Transferred Is " + totalAmount);
		scan.close();
	}

}
