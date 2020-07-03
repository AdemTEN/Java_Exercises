/*
(Find the number of days in a month) Write a program that prompts the user
to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days.
		leapYear(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

*/ 

package Exercise_03;

import java.util.Scanner;

public class Exercise_03_11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter number of month and year:");
		int month = scanner.nextInt();
		int year = scanner.nextInt();
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		if (month == 1) {
			System.out.println("January " + year + " had 31 days");
		}else if (month ==2) {
			if (leapYear) {
				System.out.println("February " + year + " had 29 days");
			}else {
				System.out.println("February " + year + " had 28 days");
			}
		}else if (month == 3) {
			System.out.println("March " + year + " had 31 days");
		}else if (month == 4) {
			System.out.println("April " + year + " had 30 days");
		}else if(month==5) {
			System.out.println("May " + year + " had 30 days");
		}else if (month == 6 ) {
			System.out.println(" June" + year + " had 31 days");
		}else if(month == 7){
			System.out.println("July " + year + " had 31 days");
		}else if(month == 8){
			System.out.println("August " + year + " had 30 days");
		}else if(month == 9){
			System.out.println("September " + year + " had 31 days");
		}else if(month == 10){
			System.out.println("October " + year + " had 30 days");
		}else if(month == 11){
			System.out.println("November " + year + " had 31 days");
		}else if(month == 7){
			System.out.println("December " + year + " had 30 days");
		}else {
			System.out.println("Invalid value");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
