package Loops;

import java.util.Scanner;

public class cikarmaQuiz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long startTime = System.currentTimeMillis();

		String output = "";// rapor icin kac soru soruldu.
		
		System.out.print("How many Qoestion do you want: ");
		int numberOfQuestion = scan.nextInt();
		
		int counter = 0;
	
		int rightAnswerCounter = 0;// kac tane dogru bildim.
		int falseanswerCounter = 0;
		while (counter < numberOfQuestion) {// kac defa fonecek.
			int num1 = (int) (Math.random() * 10);// bunu döngü disinda olustursm hep ayni soruyu sorar
			int num2 = (int) (Math.random() * 10);

			if (num1 < num2) {
				int tempNum = num1;
				num2 = num1;
				num1 = tempNum;
			}

			System.out.print(num1 + "-" + num2 + "=? ");
			int answer = scan.nextInt();
			
			output += num1 + "-" + num2 + " = " + answer;// if else ayri ayri yazalbilirdik. ama sadelestirdik.
			if (num1 - num2 == answer) {
				System.out.println("Right");
				rightAnswerCounter++;// Kac tane dogru bildim
				output += "right\n";

			} else {
				System.out.println("False");
				output += " fslse?\n";
				falseanswerCounter++;
			}
			counter++;

		}
		long finishTime = System.currentTimeMillis();
		int totalTime = (int)((finishTime - startTime) / 1000);
		System.out.println("Total Quiz Time: " + totalTime + "seconds");
		System.out.println(counter + " Question are asked");
		System.out.println("Right answers: " + rightAnswerCounter + " times");
		System.out.println("False answers: " + falseanswerCounter + " times");
		System.out.println(output);

	}
	
}
