/*
(Number of days in a year) Write a method that returns the number of days in a
year using the following header:
public static int numberOfDaysInAYear(int year)
Write a test program that displays the number of days in year from 2000 to 2020.
*/

package Exercise_06_METHODS;

public class Q_16_NumberOfDaysInAYear {

	public static void main(String[] args) {
 
		System.out.println(numberOfDaysInAYear(2000));
		
	}

	public static int numberOfDaysInAYear(int year) {
		int day = 0;
		int totalDay = 0;
		for (int i = year; i<=2020;i++) {
			if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				day = 366;
			}else {
				day = 365;
			}
			totalDay +=   day;
					
 		}
		return totalDay;
	}
	
}
