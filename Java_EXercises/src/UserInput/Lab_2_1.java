package UserInput;

import java.util.Scanner;

public class Lab_2_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.print("Enter your first number: ");
		int first = scan.nextInt();
		System.out.print("Enter your next number: ");
		int second = scan.nextInt();
		int largest;
		int smallest;
		if (first <second) {
			largest = second;
			smallest = first;
		}else {
			largest = first;
			smallest = second;
		}
		int yesOrNo;
	
		do {
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			yesOrNo = scan.nextInt();
			if (yesOrNo ==0 ) {
				break;
			}else {
				System.out.print("Enter your next number: ");
				int next = scan.nextInt();
				if(next>largest) {
					largest = next;
				}
				if (next<smallest) {
					smallest = next;
				}
			}
			
		}while(yesOrNo == 1);
		
		
		System.out.println("Largest: " + largest);
		System.out.println("Smallest:" + smallest);
		
		
	}

}
