package CLASSES;

import java.util.Scanner;

public class RouletteWheel {

	public static void main(String[] args) {
		
		RoulettePocket roulett = new RoulettePocket();
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your number between 0 and 36: ");
		
		roulett.number = scan.nextInt();
		System.out.println("The color of the pocket is: " + roulett.getPocketsColor() );

	}

}

class RoulettePocket {

	int number;


	String getPocketsColor() {

		if (number == 0) {
			return "green";
		} else if (number <= 10) {
			if (number % 2 == 1) {
				return "red";
			} else {
				return "black";
			}

		} else if(number <= 18) {
			if (number % 2 == 1) {
				return "black";
			}else {
				return "red";
			}
		}else if(number <= 28) {
			if(number % 2 == 1) {
				return "red";
			}else {
				return "black";
			}
		}else if (number <= 36 ) {
			if(number % 2 == 1) {
				return "black";
				
			}else {
				return "red";
			}
		}else {
			return "Invalid value";
		}
	}
}