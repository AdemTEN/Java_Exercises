/*
(Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
subtraction question. Revise the program to randomly generate an addition question
with two integers less than 100.
*/

package Exercise_03;

import java.util.Scanner;

public class Exercise_03_10 {

	public static void main(String[] args) {


		System.out.println("You need to know result of the addition");
		
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		
		System.out.println(a + "+" + b + "=?");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Result is: ");
		int result = scanner.nextInt();
		
		if (result == (a+b)) {
			System.out.println("Right answer... Congratulation!!!");
		}else {
			System.out.println("Wrong answer... The right answer should be: " + (a+b) + " -Again please 12");
		}
		
		
		
		
	
	
	}

}
