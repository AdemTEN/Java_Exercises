/*Write a Java program to read a string and if one or both of the first tow characters is 'o', return without those 'o',
 * otherwise return the string unchanged.

Sample Output: 
The given strings is: oocyte
The new string is: cyte

The given strings is: boat
The new string is: bat

The given strings is: own
The new string is: wn
 */
package String.stringw3resource;

public class WithoutO {

	public static void main(String[] args) {

		System.out.println(withoutO("oocyt"));
		System.out.println(withoutO("boat"));
		System.out.println(withoutO("own"));
		System.out.println(withoutO("fafg"));

	}

	public static String withoutO(String str) {
		String newStr = "";

		if (str.substring(0, 2).equals("oo")) {
			newStr = newStr + str.substring(2);

		} else if (str.substring(0, 1).equals("o")) {
			newStr = newStr + str.substring(1);

		} else if (str.substring(1, 2).equals("o")) {
			newStr = newStr + str.substring(0, 1) + str.substring(2);

		} else {
			newStr = str;
		}

		return newStr;
	}

}
