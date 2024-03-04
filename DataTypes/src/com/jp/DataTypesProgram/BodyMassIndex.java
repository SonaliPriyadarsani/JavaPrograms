package com.jp.DataTypesProgram;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float weight = scan.nextFloat();
		float height =  scan.nextFloat();
		float result = weight/(height*height);
		System.out.println("Your BMI Is " + result);
		scan.close();
	}

}
