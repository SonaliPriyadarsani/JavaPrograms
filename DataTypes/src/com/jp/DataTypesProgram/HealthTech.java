package com.jp.DataTypesProgram;

import java.util.Scanner;

public class HealthTech {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String favFood = scan.nextLine();
		int noOftime = scan.nextInt();
		System.out.println("Your Favorite Food Is " + favFood + " And You Eat It " + noOftime + " Times A Week");
		scan.close();

	}

}
