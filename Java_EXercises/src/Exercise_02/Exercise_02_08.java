/*
(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so that it prompts the user to enter
the time zone offset to GMT and displays the time in the specified time zone.
*/

package Exercise_02;

import java.util.Scanner;

public class Exercise_02_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.println("Enter GMT : ");
		int gmt = input.nextInt();
		
		long totalMillisecond = System.currentTimeMillis();
		long totalSecond = totalMillisecond / 1000;
		long currentSecond = totalSecond % 60;
		long remainMinute = totalSecond / 60;
		long currentMinute = remainMinute % 60;
		long remainHour = remainMinute / 60;
		long currentHour = remainHour % 24;
		currentHour = currentHour + gmt;
		
		
		
		System.out.println("Current Time is: " + currentHour  + ":" + currentMinute + ":" + currentSecond  );
		
	
	
	
	
	
	
	
	
	}

}
