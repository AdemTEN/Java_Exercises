/*
(Geometry: area of a triangle) Write a program that prompts the user to enter
three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
*/


package Exercise_02;

import java.util.Scanner;

public class Exercise_02_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter three point of triangle:");
	
		double x1 = input.nextDouble();	
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();	
		double y3 = input.nextDouble();
		double x3 = input.nextDouble();
		
		//double areaOftriangle = 1/2 * (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
		//					OR
		
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		double s = (side1 + side2 + side3) / 2;
		double areaOfTriangle = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		System.out.println("The area of  the Triangle is:" + (int)(areaOfTriangle * 1000) / 1000.0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
