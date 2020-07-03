package Exercise_03;

import java.util.Scanner;

public class Question9_fastShipping {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the weight of packege: ");
		double weight = scan.nextDouble();
		System.out.print("Enter the distance of shipping: ");
		double distance = scan.nextDouble();
		double extraDistance = Math.ceil(distance / 500);
		double chargesOfShipping = 0;
		
		if (weight <= 2) {
			chargesOfShipping = extraDistance * 1.10;
		}else if (weight <= 6) {
			chargesOfShipping = extraDistance * 2.20;
		}else if (weight <= 10) {
			chargesOfShipping = extraDistance * 3.70;
		}else {
			chargesOfShipping = extraDistance * 3.8;
		}
		System.out.print("The charges of shipping for " + weight + " pounds packege is: $" + chargesOfShipping  );
	}

}
