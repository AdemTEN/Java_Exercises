/*We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */

package StringReplQuestions;

import java.util.Scanner;

public class repl_78SMSmessage {

	public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);
		    String message = scan.nextLine();
		    String sender;
		    String phoneNumber;
		    String messageBody;
		    
		    int x1 = message.indexOf("<");
		    int x2 = message.indexOf(">");
		    sender = message.substring(x1+1 , x2);
		    System.out.print("Sender: " + sender+ "\n");
		    
		    int y1 = message.indexOf("[");
		    int y2 = message.indexOf("]");
		    phoneNumber = message.substring(y1+1, y2);
		    System.out.print("Phone Number: " + phoneNumber+"\n");
		    
		    int z1 = message.indexOf("{");
		    int z2 = message.indexOf("}");
		    messageBody = message.substring(z1+1, z2);
		    System.out.print("Message body: " + messageBody);
	}

}
