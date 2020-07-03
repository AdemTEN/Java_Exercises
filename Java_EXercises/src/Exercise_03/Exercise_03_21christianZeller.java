/*
(Science: day of the week) Zeller’s congruence is an algorithm developed by
Christian Zeller to calculate the day of the week.
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_21christianZeller {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the year: "  );
		int year = scan.nextInt();
		int j = year / 100;
		int k =year % 100;
		System.out.print("Enter the month of the year: ");
		int m = scan.nextInt();
		System.out.print("Enter day of the month: ");
		int q = scan.nextInt();
		
		int h = (q + (26 * (m + 1)) / 10 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		if (m == 1 ) {
			m = 13;
			--year;
			
		}else if (m == 2) {
			m = 14;
			--year; 
		}
		
		System.out.println("The day of the week: " + h);
		
		switch(h) {
		case 0: System.out.println("Saturday");break;
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thurdday");break;
		case 6: System.out.println("Friday");break;
		default : System.out.println("Invalid value");
		
		
		
		
		}
		
		
		
		
		
		
	}

}
