/*Write a Java program to return a new string using every 
 * characters of even positions from a given string. 

Sample Output:

The given string is: w3resource.com
The new string is: wrsuc.o
 */
package String.stringw3resource;

public class EvenPositionOfString {

	public static void main(String[] args) {

		System.out.println(evenPositionOfString("Hello World"));

		System.out.println(evenPositionOfString("w3resource.com"));
	}

	public static String evenPositionOfString(String str) {

		String newStr = "";

		for (int i = 0; i < str.length(); i++) {

			if (i % 2 == 0) {

				newStr = newStr + str.substring(i, i + 1);
			}
		}
		return newStr;

	}

}
