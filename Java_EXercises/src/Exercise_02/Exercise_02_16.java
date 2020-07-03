/*
(Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area.
*/
package Exercise_02;

import java.util.Scanner;

public class Exercise_02_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Enter the side of Hexagon:");
		double side = input.nextDouble();
		
		double areaOfHexagon = (3 * Math.pow(3, 0.5) * Math.pow(side, 2))  / 2;
		System.out.println("Area of the hexagon is: " + areaOfHexagon + " cm2" ); 
		
	}

}
