package com.jp.DataTypesProgram;
import java.util.Scanner;
public class Horoscope 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dob = scan.nextInt();
		int mob = scan.nextInt();
		String sign = scan.next();
		System.out.println("Day Of Birth : " + dob);
		System.out.println("Month Of Birth : " + mob);
		System.out.println("Zodiac Sign : " + sign);
		scan.close();
	}
}