package Exercise_06_METHODS.Internet;

import java.util.Scanner;

public class Nmbersaverage {

	public static void main(String[] args) {

		char ch = middleCharacter();
		System.out.println(ch);
	
		
	}
	public static char middleCharacter() {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char ch;
		if (s.length() % 2 == 1) {
		 ch = s.charAt(s.length() / 2);
		}else {
			ch = s.charAt(s.length() / 2-1);
		}
		return ch;
	}
	
	

}
