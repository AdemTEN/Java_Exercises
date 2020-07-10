/*Write a program that will print out first half of the word twice. 

Example:

input: java
output: jaja
 
 */
package StringReplQuestions;

import java.util.Scanner;

public class repl_69_PrintTwiceHalf {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
//		    System.out.println(word.substring(0, word.length()/2).concat(word.substring(0, word.length()/2)));
		    for(int i=0;i<2;i++){
		      System.out.print(word.substring(0, word.length()/2));
		    }

		  }
	}


