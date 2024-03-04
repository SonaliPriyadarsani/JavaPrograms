package com.jp.ObjectClass;
import java.util.Scanner;
public class JourneyCalculator
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Speed");
		double speed = scan.nextDouble();
		System.out.println("Enter Time");
		double time = scan.nextDouble();
		JourneyCalculaterClass jcc = new JourneyCalculaterClass();
		double cal = jcc.calculateDistance(speed, time);
		System.out.println(cal);
		scan.close();
	}

}