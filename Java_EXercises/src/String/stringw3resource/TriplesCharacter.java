/* Write a Java program to return the number of triples in the given string. 
 * A triple is a character appearing three times in a row in a string. 

SamSample Output:

The given string is: welllcommmmeee
The number of triples in the string is: 4
 */
package String.stringw3resource;

public class TriplesCharacter {

	public static void main(String[] args) {

		tripleChar("wellllcccommmmeee");
	}
	public static void tripleChar(String str) {
		int count = 0;
		for (int i = 0; i < str.length()-2; i++) {
			//1. solution:
			
//			if(str.substring(i, i+1).equals(str.substring(i+1, i+2))) {
//				if(str.substring(i, i+1).equals(str.substring(i + 2, i+3))) {
//					count++;
//				}
//			}
			
			//2. solution: 
			
			if (str.charAt(i) == str.charAt(i+1)) {
				if (str.charAt(i)== str.charAt(i+2)) {
					count++;
				}
			}
			
			
			
		}
		System.out.println(count);
	}
	
	
	
	
	

}
