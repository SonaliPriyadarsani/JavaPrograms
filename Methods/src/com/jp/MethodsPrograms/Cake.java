package com.jp.MethodsPrograms;

import java.util.Scanner;

public class Cake {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Quantity Of Flour ");
		int flour = scan.nextInt();
		System.out.println("Enter The Quantity Of Sugar ");
		int sugar = scan.nextInt();
		System.out.println("Enter The Quantity Of Egg ");
		int egg = scan.nextInt();
		int cake = bakeCake(flour , sugar , egg);
		System.out.println(cake + "kg Cake Is Ready");
		scan.close();
	}
	public static int bakeCake(int flour , int sugar , int egg)
	{
		//Mix Flour And Egg
		int mix = flour + sugar ;
		
		//Beat In The Eggs
		int batter = mix + egg;
		
		//Back The Batter And Get The Cake
		int cake = batter ;
		return cake ;
	}
}
