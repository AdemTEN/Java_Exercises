/*
(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
to compute the wind-chill temperature. The formula is valid for temperatures in
the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
Write a program that prompts the user to enter a temperature and a wind speed.
The program displays the wind-chill temperature if the input is valid; otherwise,
it displays a message indicating whether the temperature and/or wind speed is
invalid. twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
 ta is the outside temperature measured in degrees Fahrenheit and v is the
speed measured in miles per hour. twc is the wind-chill temperature. 
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_20windChill {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter autside temperture (ta) and speed of wind(v): ");
		
		double ta = scan.nextDouble();
		double v = scan.nextDouble();
		
		
		scan.close();
		double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4225 * ta * Math.pow(v, 0.16);
		
		
		if ((-58 < ta && ta < 41) && v >= 2) {
			System.out.println("The wind-chill temperature: " + (int)(twc * 1000) * 1000.0);
			
		}else {
			System.out.println("Invalid values");
		}
		
		
		
		
		
		
		
	}

}
