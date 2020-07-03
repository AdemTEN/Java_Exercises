/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
*/
package Exercise_02;

import java.util.Scanner;

public class Exercise_02_03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a value as feet:");
		double feet = input.nextDouble();
		
		final double METER_PERFOOT = 0.305;
		double meter = feet * METER_PERFOOT;
		System.out.println(feet + " feet is: " + (int)(meter * 10000)/10000.0 + " meters");
		
	    double x = 10.67499999999999;
		double b = (int)(x * 10000) /10000.0;
		System.out.println(b);
		

		
	}

}
