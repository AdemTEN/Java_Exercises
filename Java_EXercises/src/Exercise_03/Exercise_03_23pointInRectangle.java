/*
(Geometry: point in a rectangle?) Write a program that prompts the user to enter
a point (x, y) and checks whether the point is within the rectangle centered at
(0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
(6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
cover all cases.) Here are two sample runs.
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_23pointInRectangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter two points with two coordinates: ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		scan.close();
		
		boolean withInRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10.0 / 2) 
							&& (Math.pow(Math.pow(y, 2), 0.5) <= 5 / 2);   
		
		System.out.println(x  + ", " + y + "is " +
		 ((withInRectangle) ? " in" : " not in" ) + " the rectangle");
		
		
		
		
		
		
		
		
		
		
		
	}

}
