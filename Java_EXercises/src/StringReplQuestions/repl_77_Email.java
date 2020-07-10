/*Write a program that will print out information about user based on email. 
 Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */
package StringReplQuestions;

import java.util.Scanner;

public class repl_77_Email {

	public static void main(String[] args) {

		
		    Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    int x = email.indexOf("_");
		    int y = email.indexOf("@");
		    int z = email.indexOf(".");
		    
		    System.out.println("First name: " + email.toUpperCase().substring(0, 1) + email.substring(1,x));
		    System.out.println("Last name: " + email.toUpperCase().substring(x+1, x+2) + email.substring(x+2,y));
		    System.out.println("Domain: " + email.substring(y+1,z));
		    System.out.println("Top-Level Domain: " + email.substring(z+1));
		    
		    
		  }

}
