/*
(Convert pounds into kilograms) Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms.
*/

package Exercise_02;

import java.util.Scanner;

public class Exercise_02_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a value as pound:");
		final double POUND_PER_KILOGRAM = 0.5454;
		double pound = input.nextDouble();
		double kilogram = POUND_PER_KILOGRAM * pound;
		
		System.out.println(pound + " pound is: " + (int)(kilogram * 100) / 100.0 + " kilograms");
		
		
		
	}

}
