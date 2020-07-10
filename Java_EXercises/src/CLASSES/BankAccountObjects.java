package CLASSES;

public class BankAccountObjects {

	public static void main(String[] args) {
		BankAccount person1 = new BankAccount();
		person1.accountHolder = "Mike Smith";
		person1.accountNumber = 12345;
		
		person1.deposit(500);
		System.out.println();
		person1.showBalance();
		System.out.println();
		person1.withdraw(200);
		System.out.println();
		person1.showBalance();
		System.out.println();
		person1.charge(100, "computer");
		System.out.println();
		person1.showBalance();
	}

}
