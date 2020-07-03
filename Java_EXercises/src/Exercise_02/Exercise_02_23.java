/*
(Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip.
*/
package Exercise_02;

import java.util.Scanner;

public class Exercise_02_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter distance, fuel effciency and the price per gallon:");
		double distance = input.nextDouble();
		double fuelEfficienycy = input.nextDouble();
		double price = input.nextDouble();
		
		double costOfDriving = (distance / fuelEfficienycy) * price;
		System.out.println("The cost of driving : $" + costOfDriving);
		
		

	}

}
