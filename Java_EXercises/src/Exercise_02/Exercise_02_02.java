/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length
*/

package Exercise_02;

import java.util.Scanner;

public class Exercise_02_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter radius of cylinder: " );
		double radius = input.nextDouble();
		System.out.println("Enter lenght of cylinder: ");
		double lenght = input.nextDouble();
		final double PI = 3.14;
		double area = Math.pow(radius, 2) * PI;
		
		double volume = area * lenght;
		
		System.out.println("The area of Cylinder is: " + area);
		System.out.println("The volume of Cylinder is: " + volume);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
