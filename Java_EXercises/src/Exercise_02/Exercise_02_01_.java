/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
*/
package Exercise_02;

import java.util.Scanner;

public class Exercise_02_01_ {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a celcius value: ");
		double celcius = input.nextDouble();
	
		double fahrenheit = (9.0 / 5) * celcius + 32;
		System.out.println(celcius + " Celcius is : " + fahrenheit + " Fahrenheit." );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
