/*
(Area and perimeter of a rectangle) Write a program that displays the area and
perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
formula:
						area = width * height
*/


package Exercise_01;

public class Exercise_01_09 {

	public static void main(String[] args) {

		double width = 4.5; 
		double height = 7.9; 
		
		double area = width * height; 
		double perimeter = (width + height) * 2;
		
		System.out.println("The area of the ractangle:" + area); 
		System.out.println("The perimeter of the rectangle:"  + perimeter);
		
		
		
	}

}
