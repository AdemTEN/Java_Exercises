/*
(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
*/

package Exercise_03;

import java.util.Scanner;

public class Exercise_03_02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int  n1 =(int)(Math.random() * 10); 
		int  n2 =(int)(Math.random() * 10); 
		int  n3 =(int)(Math.random() * 10);
		
		System.out.print(n1 + "+" + n2 + "+" + n3+ "=?" );
		int myenswer = input.nextInt();
		
		int sum = n1 + n2 + n3;
		
		if (myenswer == sum) {
			System.out.println("right");
			
		}else {
			System.out.println("false. Answer should be : " + sum);
			
		}
		
		
		
		
		
		
		
		
	}

}
