/*
(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit
number. The program prompts the user to enter a three-digit number and
determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is
$10,000.
2. If all digits in the user input match all digits in the lottery number, the award is
$3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is
$1,000.
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_15__Lottery {
	
	public static void main (String [] args ) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter your three digit numbers: ");
		int guess = scanner.nextInt();
		
		int guessd1 = guess / 100;
		int guessd2 = (guess % 100) / 10;
		int guessd3 = (guess % 100) % 10;
		
		
		
		int lottery = (int)(Math.random() * 900) + 100;
		int lotteryd1 = lottery / 100;
		int lotteryd2 = (lottery % 100) / 10;
		int lotteryd3 = (lottery % 100) % 10;
		System.out.println("The lottery is:" + lottery);
		
		
		if (lottery == guess) {
			System.out.println(" you have known axact number the award is $10,000."); 
		
		} else if((guessd1 == lotteryd1 || guessd1 == lotteryd2 || guessd1 == lotteryd3) && 
			(guessd2 == lotteryd1 ||  guessd2 == lotteryd2 || guessd2== lotteryd3) &&
			(guessd3 == lotteryd1 ||  guessd3 == lotteryd2 || guessd3== lotteryd3)) {
			
			System.out.println("You have known all digit number the award is $3000. ");
			
		}else if ((guessd1 == lotteryd1 || guessd1 == lotteryd2 || guessd1 == lotteryd3) ||
				(guessd2 == lotteryd1 ||  guessd2 == lotteryd2 || guessd2== lotteryd3) ||
				(guessd3 == lotteryd1 ||  guessd3 == lotteryd2 || guessd3== lotteryd3)) {
			System.out.println("you have known one digit number  the award is $1000");
		
		}else {
			System.out.println("you have known no digit the award is $0.");
		}
		
		
		
		
		
		
		
			
		}
			
			
		
		
		
		
		
		
		
		
	}


