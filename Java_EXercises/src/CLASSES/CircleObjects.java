package CLASSES;

import java.util.Scanner;

public class CircleObjects {

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		circle1.radius = scan.nextDouble();
		System.out.println("Area of the Circle: " + (int)(circle1.getArea() * 100) / 100.0);
		System.out.println("Diameter of Circle: " + circle1.getDiameter());
		System.out.println("Circumference of Circle: " + circle1.getCircumference());
	}

}
