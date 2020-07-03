// (The MyTriangle class) Create a class named MyTriangle that contains the
// following two methods:
//
// /** Return true if the sum of any two sides is
// * greater than the third side. */
// public static boolean isValid(
// 	double side1, double side2, double side3)
//
// /** Return the area of the triangle. */
// public static double area(
// 	double side1, double side2, double side3)
//
// Write a test program that reads three sides for a triangle and computes the
// the input is valid. Otherwise, it displays that the input is invalid. The formula
// computing the area of a triangle is given in Programming Exercise 2.19.

package Exercise_06_METHODS;

public class Q_19_TheVAlidTriangle {

	public static void main(String[] args) {
		double side1 = 12;
		double side2 = 25;
		double side3 = 15;
		if(isValid(side1, side2, side3) == true) {
			System.out.println(area(side1, side2, side3));
		}else {
			System.out.println("invalid triangle");
		}
		
	}

	public static boolean isValid(double side1, double side2, double side3) {
		if(side1>(side2+side3)) {
			return false;
		}else if(side2>(side1+ side3)) {
			return false;
		}else if(side2>(side1+ side3)) {
			return false;
		}
			return true;
	}
	
	
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		}
	}

