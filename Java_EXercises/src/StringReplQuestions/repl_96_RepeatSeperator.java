/*Given two strings, word and a separator sep, 
return a big string made of count occurrences of the word, separated by the separator string.
Example:
input: Word
input: X
input: 3
output: WordXWordXWord

Example:
input: This
input: And
input: 2
output: ThisAndThis

Example:
input: This
input: And
input: 1
output: This
 * 
 */
package StringReplQuestions;

import java.util.Scanner;

public class repl_96_RepeatSeperator {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    String separator = scan.next();
		    int count = scan.nextInt();
		    String newWord = "";
		    if (count == 1){
		      System.out.println(word);
		    } else{
		      for(int i = 1; i<=count; i++){
		      newWord += word + " "; 
		     
		    }
		   newWord = newWord.replace(" ", separator);
		   int x = separator.length();
		   newWord = newWord.substring(0, newWord.length()-x);
		    System.out.println(newWord);
		    }
	}

}
