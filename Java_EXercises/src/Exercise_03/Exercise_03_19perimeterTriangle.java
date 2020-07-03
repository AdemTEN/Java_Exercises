/*
(Compute the perimeter of a triangle) Write a program that reads three edges for
a triangle and computes the primeter if the input is valid. Otherwise, display that
the input is invalid. The input is valid if the sum of every pair of two edges is
greater than the remaining edge.
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_19perimeterTriangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the three edge of triangle:");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		if ((a+b) > c && (a+c) > b && (b+c) > a) {
			System.out.println("The input is valid: ");
		}else {
			System.out.println("The input is not valid:");
		}
		
		System.out.println("The perimeter of the trinagle: " + (a+b+c));
		
	}

}
