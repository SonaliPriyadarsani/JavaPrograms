package com.jp.MethodsPrograms;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double principal = scan.nextDouble();
		double rate = scan.nextDouble();
		double time = scan.nextDouble();
		double result = calculateSimpleInterest(principal,rate,time);
		System.out.println(result);
		scan.close();

	}
	public static double calculateSimpleInterest(double principle , double rate , double time )
	{
		return principle*rate*time ;
	}

}
