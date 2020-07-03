package CLASSES;

public class Circle {
	
	double radius;
	final double PI = 3.14159;
	

	double getArea() {
		
		return PI * Math.pow(radius, 2);
	}

	double getDiameter() {
		
		return radius * 2;
	}
	
	double getCircumference() {
		
		return 2 * PI * radius;
	}
}
