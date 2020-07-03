/*
(Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius,
and energy Q is measured in joules.
*/


package Exercise_02;

import java.util.Scanner;

public class Exercise_02_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter weight of water :");
		double kilograms = input.nextDouble();
		System.out.println("Enter initial temperature of water:");
		double initialTemperature = input.nextDouble();
		System.out.println("Enter final temparature of water: ");
		double finalTemparature = input.nextDouble();
		
		double energy = kilograms * (finalTemparature - initialTemperature) * 4184;

		System.out.println("The needed energy : " + energy);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
