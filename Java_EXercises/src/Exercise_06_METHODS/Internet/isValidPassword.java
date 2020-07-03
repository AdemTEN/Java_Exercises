//package Exercise_06_METHODS.Internet;
//
//import java.util.Scanner;
//
//public class isValidPassword {
//
//	public static void main(String[] args) {
//
//		
//		
//		if(isEightCharacter(password)) {
//			if(isLettersAndDigits(password)) {
//				if(isAtlestTwoDigit(password)) {
//					System.out.println("Valid Password");
//				}
//				}
//			}else {
//			
//					System.out.println("Invalid Password");
//		}
//		
//		
//		
//	}
//
//	public static boolean isEightCharacter(String password) {
//
//		
//		int length = password.length();
//		if (length >= 8) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//
//	public static boolean isLettersAndDigits(String password) {
//		
//
//		for (int i = 0; i <= password.length() ; i++) {
//			if (!Character.isLetterOrDigit(password.charAt(i))) {
//				return false;
//		}
//		
//
//	}
//		return true;
//	}
//	public static boolean isAtlestTwoDigit(String password) {
//		
//		
//		int count = 0;
//		for (int i = 0; i <= password.length(); i++) {
//			if(Character.isDigit(password.charAt(i))) {
//				count ++;
//				
//				}
//			}
//		if(count>=2) {
//			return true;
//		}else {
//			return false;
//		}
//		
//				
//	}
//	
//
//}
