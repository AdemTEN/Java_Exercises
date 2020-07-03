/*
(Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.
*/
package Exercise_02;

import java.util.Scanner;

public class Exercise_02_15 {

	public static void main(String[] args) {
       
	 Scanner input = new Scanner(System.in);
		System.out.println("Enter x1,y1 and x2,y2");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double distanceOfTwoPoints = Math.pow(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2), 0.5); 
		System.out.println("Distance between two point is:" + distanceOfTwoPoints);
		
		
		

	}

}
