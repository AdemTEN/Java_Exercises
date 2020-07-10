/*Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */
package StringReplQuestions;

import java.util.Scanner;

public class repl_97_CountJava {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    int countJava = 0;
	    for (int i = 0; i < word.length()-3; i++){
	      if(word.substring(i, i+4).equals("java")){
	        countJava++;
	        
	      }
	    }
	    System.out.println(countJava);
	}

}
