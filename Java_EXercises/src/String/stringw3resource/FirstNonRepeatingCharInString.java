/*Write a Java program to find first non repeating character in a string.

Sample Output:

The given string is: gibblegabbler
The first non repeated character in String is: i

 * 
 */
package StringManipulations;

public class FirstNonRepeatingCharInString {

	public static void main(String[] args) {

		String str = "aaddjjffhhixxxxijkkllxo";

		String nonRepeatingChar = "";

		if (str.indexOf(str.substring(0, 1), 1) == -1) {

			nonRepeatingChar += str.substring(0, 1);

			System.out.println(nonRepeatingChar);

			return;

		} else {
			
			for (int i = 1; i < str.length(); i++) {

				if (str.substring(i + 1).indexOf(str.substring(i, i + 1)) == -1) {

					if (!str.substring(0, i).contains(str.substring(i, i + 1))) {

						nonRepeatingChar = nonRepeatingChar + str.substring(i, i + 1);

						break;
					}

				} else {

					continue;
				}

			}
			System.out.println(nonRepeatingChar);
		}

	}
}
