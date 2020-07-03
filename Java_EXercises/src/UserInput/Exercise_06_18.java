package UserInput;

import java.util.Scanner;

public class Exercise_06_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password:");
		String password = scan.next();
		boolean eightCahrachter = isPassword8Character(password);
		if (eightCahrachter) {
			if (isOnlyLetterOrDigit(password)) {
				if(isHasTwoNumbers(password)) {
					System.out.println("Password is valid");
				}
			}
			
		}else {
			System.out.println("Password is Invalid");
		}
		
	}
	public static boolean isPassword8Character(String password) {
		
		int lenght = password.length(); 
		if (lenght == 8) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean isOnlyLetterOrDigit(String password) {
		
		for (int i = 0 ;i<password.length(); i++) {
			if(!Character.isLetterOrDigit(password.charAt(i))) {
				return false;
			}
					
			
		}
		return true;
		
	}
	
	public static boolean isHasTwoNumbers(String password) {
		boolean flag = true;
		int number = 0;
		for(int i = 0; i <password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				number++;
				
				}
			}
		if(number >= 2) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
	
	

}
