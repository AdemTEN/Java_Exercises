/*In this task, you need to swap first name with last name in the email.
If email doesn't contains underscore - do not anything. 

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
 */
package StringReplQuestions;

import java.util.Scanner;

public class repl_76_SwapTwoWords {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    String email = scan.next();
		    if(!email.contains("_")){
		      System.out.println(email);
		    }else{
		      int x = email.indexOf("_");
		      int y = email.indexOf("@");
		      System.out.println(email.substring(x+1, y)+"_" 
		      + email.substring(0, x) + email.substring(y));
		    }
		    
		    
		  }
	}


