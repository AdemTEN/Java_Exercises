/*
(Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1,
y1), you can use the following condition to decide whether a point p2(x2, y2) is
on the left of the line, on the right, or on the same line
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_32pointPosition {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter p0, p1 and p2: ");
		double x0 = scan.nextDouble();
		double y0 = scan.nextDouble();
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		double formul = (x1 -x0) * (y2-y0) - (x2 -x0) * (y1- y0);
		
		if (formul > 0) {
			System.out.println("p2 is on the left side");
		}else if (formul == 0) {
			System.out.println("p2 is on the line");
		}else {
			System.out.println("p2 is on the right side");
		}
		
		
		
		
	}

}
