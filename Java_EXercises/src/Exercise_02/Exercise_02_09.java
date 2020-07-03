/*
(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:
                                  v1 - v0
                             a = ---------
                                     t
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
and displays the average acceleration.
*/
package Exercise_02;

import java.util.Scanner;

public class Exercise_02_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter starting velocity: ");
		double v0 = input.nextDouble();
		System.out.println("Enter ending veloxity:");
		double v1 = input.nextDouble();
		System.out.println("Enter the time span:");
		double t = input.nextDouble();
		
		double a = (v1 - v0) / t;
		System.out.println("The avarege acceleration is :" + (int)(a * 100) / 100.0 );
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
