/*Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25% 
The program should display the following information based on the user input: 
Split or No split
Number of people entered: &&&&
Service Quality: 
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input: 
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:
 
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 * 
 */
package StringReplQuestions;

import java.util.Scanner;

public class repl_90_Tip_Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Split:");
		String split = scan.next();
		System.out.println("Number of people:");
		int people = scan.nextInt();
		System.out.println("Check amount:");
		double checkAmount = scan.nextDouble();
		System.out.println("Service Quality:");
		String quality = scan.next();
		double totalTip = 0;
		if (quality.equals("Poor")) {
			totalTip = checkAmount * 5 / 100;
		} else if (quality.equals("Fair")) {
			totalTip = checkAmount * 10 / 100;
		} else if (quality.equals("Good")) {
			totalTip = checkAmount * 15 / 100;
		} else if (quality.equals("Great")) {
			totalTip = checkAmount * 20 / 100;
		} else if (quality.equals("Excellent")) {
			totalTip = checkAmount * 25 / 100;
		}

		double totalToPay = checkAmount + totalTip;
		double totalPerPerson = totalToPay / people;
		double tipPerPerson = totalTip / people;
		String numberOfPeople = "";
		for (int i = 1; i <= people; i++) {
			numberOfPeople += "&";

		}
		System.out.println("Number of people entered: " + numberOfPeople);

		System.out.println("Total to pay: " + totalToPay);
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " + totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);

	}

}
