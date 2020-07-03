package UserInput;

import java.util.Scanner;

public class Task_74 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number;
		int sum = 0;
		do {
		System.out.print("Enter your number: ");
		number = scan.nextInt();
		if(number <0) {
			break;
		}
		sum += number;	
			
		}while(number>=0);
		System.out.println("Sum is: " + sum);
	}

}
