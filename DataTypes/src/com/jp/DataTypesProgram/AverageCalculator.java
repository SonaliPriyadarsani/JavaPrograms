package com.jp.DataTypesProgram;
import java.util.Scanner;
public class AverageCalculator 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		double avg = (double)(a+b+c+d+e)/5;
		System.out.println("Average : " + avg);
		scan.close();
	}
}