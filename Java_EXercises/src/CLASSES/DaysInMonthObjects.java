package CLASSES;

import java.util.Scanner;

public class DaysInMonthObjects {

	public static void main(String[] args) {
		MonthDays try1 = new MonthDays();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year and month: ");
		try1.year = scan.nextInt();
		try1.month = scan.nextInt();
		
		try1.getNumberOfDays();
		
		
		
	}

}

class MonthDays {
	int month;
	int year;

	void getNumberOfDays() {
		boolean leapYear = ((year % 100 == 0) && (year % 400 == 0)) || (year % 4 == 0);
		if (leapYear) {
			switch (month) {
			case 1:
				System.out.println("31 days");
				break;
			case 2:
				System.out.println("29 days");
				break;
			case 3:
				System.out.println("31 days");
				break;
			case 4:
				System.out.println("30 days");
				break;
			case 5:
				System.out.println("31 days");
				break;
			case 6:
				System.out.println("30 days");
				break;
			case 7:
				System.out.println("31 days");
				break;
			case 8:
				System.out.println("30 days");
				break;
			case 9:
				System.out.println("31 days");
				break;
			case 10:
				System.out.println("30 days");
				break;
			case 11:
				System.out.println("31 days");
				break;
			case 12:
				System.out.println("30 days");
				break;
			}
		} else {
			if (!leapYear) {
				switch (month) {
				case 1:
					System.out.println("31 days");
					break;
				case 2:
					System.out.println("28 days");
					break;
				case 3:
					System.out.println("31 days");
					break;
				case 4:
					System.out.println("30 days");
					break;
				case 5:
					System.out.println("31 days");
					break;
				case 6:
					System.out.println("30 days");
					break;
				case 7:
					System.out.println("31 days");
					break;
				case 8:
					System.out.println("30 days");
					break;
				case 9:
					System.out.println("31 days");
					break;
				case 10:
					System.out.println("30 days");
					break;
				case 11:
					System.out.println("31 days");
					break;
				case 12:
					System.out.println("30 days");
					break;
				}
			}
		}

	}
}