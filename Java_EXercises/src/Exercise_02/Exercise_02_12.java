/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
												v^2
									length = ---
												 2a
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway
length.
*/


package Exercise_02;

import java.util.Scanner;

public class Exercise_02_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter speed and acceleration");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double lenght = Math.pow(speed, 2) / (2 *acceleration);
		
		System.out.println("The minimum runway lenght for this:" + (int)(lenght * 100) / 100.0);	
		
		
		
		
		
		
		

	}

}
