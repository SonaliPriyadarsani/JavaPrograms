package com.lc.WhileLoop;
import java.util.Scanner;
public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean res = cheackArmstrongNum(number);
        if(res==true)
        {
            System.out.println(number + " is an Armstrong number.");
        }
        else
        {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
	}
	public static boolean cheackArmstrongNum(int number)
	{
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        // Count number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Calculate result
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if number is Armstrong
        if (result == number)
        {
        	return true;
        }
        else
        {
        	return false;
        }
	}
}