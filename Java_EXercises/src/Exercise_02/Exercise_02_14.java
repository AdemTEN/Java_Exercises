/*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/
package Exercise_02;

import java.util.Scanner;

public class Exercise_02_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter value of weight as pound and height as inches:");
		double weight = input.nextDouble();
		double height = input.nextDouble();
		final double KILO_PER_INCH = 0.45359237;
		final double METER_PER_INCH = 0.0254;
		double kilogram = weight *  KILO_PER_INCH;
		double meter = height * METER_PER_INCH;
		double BMI = kilogram / Math.pow(meter, 2);
		System.out.println("BMI:" + BMI);

		
	}

}
