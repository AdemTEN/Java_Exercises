/*Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = . 
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
 * 
 */
package StringReplQuestions;

import java.util.Scanner;

public class repl_93_HasJava {

	public static void main(String[] args) {
		 boolean exists = false;
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    if(word.length()<4){
		      exists = false;
		     
		    }else if(word.length()== 4){
		     if(word.equals("java")){
		       exists = true;
		     } 
		    }else{
		      if(word.substring(0,4).equals("java")|| word.substring(1,5).equals("java")){
		        exists = true;
		      }else{
		        exists = false;
		      }
		    }
		    System.out. println(exists);
		    

	}

}
