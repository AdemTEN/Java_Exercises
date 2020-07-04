/*Write a Java program to return true from a given string 
 * if the first two characters in the string also appear at the end.

Sample Output:

The given strings is: educated
The first two characters appear in the last is: true 
 */
package String.stringw3resource;

public class Q_63_FirstTwoAtTheEnd {

	public static void main(String[] args) {

		System.out.println(appearAtTheEnd("educated"));
		
	}
	
	public static boolean appearAtTheEnd(String str) {
		
		
		if(str.substring(0, 2).equalsIgnoreCase(str.substring(str.length()-2))) {
			
			return true;
			
		}else {
			
			return false;
		}
		
	}
	

}
