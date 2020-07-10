package CLASSES;

public class BankAccount {

	double balance;
	String accountHolder;
	int accountNumber;

	public void deposit(double amount) {
		
		System.out.println("depositin $" + amount + " to " + accountHolder);
		balance += amount;
		
	}
	
	public void withdraw( double amount) {
		
		System.out.println("Withdraw $" + amount + " from " + accountHolder);
		balance -= amount;
	}
	
	public void showBalance() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance $:" + balance);
		
		
	}
	
	public void charge(double price, String item) {
		
		if (balance>=price) {
			System.out.println("buying " +item + " for $ " + price + " from " + accountNumber);
			balance -= price;
		}else {
			System.out.println("insufficient fonds for purchase " + item + " from " + accountNumber);
		}
	}
	
}
