package Exercise_03;

import java.util.Scanner;

public class BooksNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the books number of customer: ");
		int numberOfCustomerBooks = scan.nextInt();
		int pointsOfCustomer = 0;
		
		if (numberOfCustomerBooks == 0) {
			pointsOfCustomer = 0;
		}else if (numberOfCustomerBooks == 1) {
			pointsOfCustomer = 5;
		}else if(numberOfCustomerBooks == 2) {
			pointsOfCustomer = 15;
		}else if (numberOfCustomerBooks == 3) {
			pointsOfCustomer = 30;
		}else if(numberOfCustomerBooks >= 4) {
			pointsOfCustomer = 60;
		}else {
			System.out.println("invalid value!!!");
		}
		
		System.out.println("The points of customer is: " + pointsOfCustomer);
		
		

	}

}
