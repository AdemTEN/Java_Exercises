package CLASSES;

import java.util.Scanner;

import Exercise_03.a;

public class SavingAccounts {

	public static void main(String[] args) {

		Save accaunt = new Save();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the annual interest Rate: ");
		accaunt.annualInterest = scan.nextDouble();
		
		System.out.print("Enter the starting balance: ");
		accaunt.balance = scan.nextDouble();
		
		System.out.print("Enter the number of months: ");
		double months = scan.nextDouble();
		
		double deposittotal = 0;
		double withdrawaltotal = 0;
		
		for (int i = 1; i <= months; i++) {
			System.out.println("Enter the amount of deposit: ");
			
			double deposit = scan.nextDouble();
			
			accaunt.adding(deposit);
			
			deposittotal += deposit;
			
			System.out.println("Enter the withdawal :");
			
			double withdrawal = scan.nextDouble();
			
			withdrawaltotal += withdrawal;
			
			accaunt.subtracting(withdrawal);

			accaunt.monthlyInterest();

		}
		System.out.println("Total balance : " + accaunt.balance);
		System.out.println("Total deposit: " + deposittotal);
		System.out.println("Total withdrawal: " + withdrawaltotal);

	}

}

class Save {

	double balance;
	double annualInterest;

	double subtracting(double withdrawal) {
		balance -= withdrawal;
		return balance;

	}

	double adding(double deposit) {
		balance += deposit;
		return balance;
	}

	double monthlyInterest() {
		double monthlyInterest = annualInterest / 12;
		balance = balance + (balance * monthlyInterest);

		return balance;
	}

}
