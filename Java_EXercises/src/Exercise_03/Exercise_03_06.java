/*
(Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
inches, you will enter 5 for feet and 10 for inches.
*/package Exercise_03;

import java.util.Scanner;

public class Exercise_03_06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the value of weight and length:");
		
		double weight = scanner.nextDouble();
		double height = scanner.nextDouble();
		
		double bmi = weight / Math.pow(height, 2);
		System.out.println("BMI:" + bmi);
		
		if (bmi< 18) {
			System.out.println("Underweight");
		}else if(bmi<25) {
			System.out.println("Normal");
		}else if (bmi<30) {
			System.out.println("Overweight");
		}else {
			System.out.println("Obese");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
