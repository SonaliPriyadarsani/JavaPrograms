package com.lc.WhileLoop;

import java.util.Scanner;

public class EnergyLevel {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Energy Leve;");
		int energyLevel = scan.nextInt();
		while(energyLevel >= 1)
		{
			System.out.println("Energy Level Of The Man Is " + energyLevel);
			energyLevel--;
		}
		scan.close();
	}

}
