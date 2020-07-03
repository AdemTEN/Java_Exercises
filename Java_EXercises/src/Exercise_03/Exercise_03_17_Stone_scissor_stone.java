/*
(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws.
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_17_Stone_scissor_stone {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter your numbers for 0=scissor, 1= rock, 2= paper :");
		int myNumber = scanner.nextInt();
		
		int computer = (int)(Math.random() * 3);	
		System.out.println("Computer number: " +  computer);

		
		if(myNumber == 0) {
			if(computer == 0) {
				System.out.println("draw");
			}else if (computer == 1) {
				System.out.println("loss");
			}else {
				System.out.println("win");
			}
		}else if(myNumber == 1 ) {
			if (computer == 0) {
				System.out.println("win");
			}else if(computer == 1) {
				System.out.println("draw");
			}else {
				System.out.println("los");
			}
			
		}else if (myNumber == 2) {
			if (computer == 0) {
				System.out.println("los");
			}else if(computer == 1) {
				System.out.println("win");
			}else {
				System.out.println("draw");
			}
		}else {
			System.out.println("invalid value");
		}
		
		
		
		
		
		
		
		
		
	}

}
