/*Write a Java program to read a string and return the string without the first two characters.
 Except keep the first char if it is 'g' and keep the second char if it is 'h'. 

Sample Output:

The given strings is: goat
The new string is: gat

he given strings is: photo
The new string is: hoto

The given strings is: ghost
The new string is: ghost 
 */
package String.stringw3resource;

public class WithoutTwoCharacters {

	public static void main(String[] args) {

		System.out.println(withoutTwoCharacters("goat"));
		System.out.println(withoutTwoCharacters("photo"));
		System.out.println(withoutTwoCharacters("ghost"));
	}

	public static String withoutTwoCharacters(String str) {
		String newStr = "";

		if (str.substring(0, 2).equalsIgnoreCase("gh")) {
			newStr = str;

		} else if (str.substring(0, 1).equalsIgnoreCase("g") && str.indexOf("h") != 1) {
			newStr = newStr + str.substring(0, 1) + str.substring(2);

		} else if (str.indexOf("g") != 0 && str.substring(1, 2).equalsIgnoreCase("h")) {
			newStr = newStr + str.substring(1);

		} else {
			newStr = newStr + str.substring(2);
		}
		return newStr;

	}
}
