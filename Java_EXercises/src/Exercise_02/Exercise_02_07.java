/*
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days. Here is a sample run:
*/

package Exercise_02;

import java.util.Scanner;

public class Exercise_02_07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter  minute: " ); 
		int totalMinute = input.nextInt();
		  
		int minute = totalMinute % 60;
		int remainHour = totalMinute / 60;
		int hours = remainHour % 24;
		int remainDay = remainHour / 24;
		int day = remainDay % 365;
		int year = remainDay /365;
		System.out.println(totalMinute + " minutes: " + year +" years " + day   
				+ " days " + hours +" hours "  + minute+ " minutes.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
