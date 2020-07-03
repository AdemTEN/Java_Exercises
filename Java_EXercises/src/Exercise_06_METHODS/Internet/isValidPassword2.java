package Exercise_06_METHODS.Internet;

import java.util.Scanner;

public class isValidPassword2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Password: ");
		String password = scan.nextLine();

		if(isAtLeast8Character(password)) {
			if(isDigitOrLetter1(password)) {
				if(isAtLeast2Digit(password)) {
					System.out.println("Password is valid.");
				
				}
			}
		}else {
			System.out.println("Invalid password");
		}
	}

	
	public static boolean isAtLeast8Character(String password) {
		int count = 0;
		for (int i = 0; i<password.length();i++) {
			count++;
			
		}
		if(count>=8) {
			return true;
		}else {
			return false;
		}
		
		
	}
	public static boolean isDigitOrLetter1(String password) {
		boolean flag = true;
		for (int i = 0; i<password.length();i++) {
			if(!Character.isLetterOrDigit(password.charAt(i))) {
				flag =  false;
			}else {
				flag = true;
			}
		}
		return flag;
	}
	public static boolean isAtLeast2Digit(String password) {
		int count = 0;
		for ( int i = 0; i<password.length(); i++) {
			if(Character.isDigit(password.charAt(i))) {
				count++;
			}
						}
		
	if(count>=2) {
		return true;
	}else {
		return false;

	}
}
}
