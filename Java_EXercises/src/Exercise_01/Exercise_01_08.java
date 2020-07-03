/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi
*/


package Exercise_01;

public class Exercise_01_08 {

	public static void main(String[] args) {

		final double PI = 3.14;
		double radius = 5.5;
		
		double perimeter = 2 * radius * PI;
		double area = radius * radius * PI; 
		
		System.out.println("Perimeter of circle is: " + perimeter);
		System.out.println("Area of circle is: " + area);
		
		
		
	}

}
