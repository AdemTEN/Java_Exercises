/*
(Game: heads or tails) Write a program that lets the user guess whether the flip of
a coin results in heads or tails. The program randomly generates an integer 0 or 1,
which represents head or tail. The program prompts the user to enter a guess and
reports whether the guess is correct or incorrect.
*/
package Exercise_03;

import java.util.Scanner;

public class Exercise_03_14HeadTail {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
	    System.out.print("Enter your guess: ");
		int guess = scanner.nextInt();

		int headOrTails = (int)(Math.random() * 2);
		System.out.println(headOrTails);
		
		System.out.println(((guess == headOrTails) ? "Rigth " : "Wrong " )+ "answer" );
		
	}

}
