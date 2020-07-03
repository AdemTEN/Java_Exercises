/*
(Current time) Revise Programming Exercise 2.8 to display the hour using a
12-hour clock. Here is a sample run:
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_30currentTime {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the GMT: ");
		int gmt = scan.nextInt();
		scan.close();
		
		long curentTotalMilliTime = System.currentTimeMillis();
		long currentTotalSecond = curentTotalMilliTime / 1000;
		long currentSecond = currentTotalSecond % 60;
		long currentMinute = (currentTotalSecond / 60) % 60;
		long currentHour = ((currentTotalSecond / 60) / 60) % 24; 
             currentHour += gmt; 
		if (currentHour > 12) {
		    currentHour -= 12 ;
		    System.out.println("The current time is: "  + currentHour + ":" + currentMinute + ":" + currentSecond + " PM");
		}else {
			System.out.println("The current time is: "  + (currentHour) + ":" + currentMinute + ":" + currentSecond + " AM");
		}
		
		    
		    
		    
		    
		    
		
		
		
		
		
		
		
		
	}

}
