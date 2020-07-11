/* Write a Java program to divide a string in n equal parts. 
Sample Output:

The given string is: abcdefghijklmnopqrstuvwxy
The string divided into 5 parts and they are: 

abcde
fghij
klmno
pqrst
uvwxy

 * 
 */
package String.stringw3resource;

public class DivideStringNEqualPart {

	public static void main(String[] args) {

		divideStringNEqualPart("abcdefghjklmnoöprasd", 5);

	}

	public static void divideStringNEqualPart(String str, int n) {

		int lengthOfString = str.length();

		if (lengthOfString % n != 0) {

			System.out.println("String is not divided " + n + " equal part");

		} else {

			System.out.println("String   is divided " + n + " equal part");

			for (int i = 0; i < str.length(); i += n) {

				System.out.println(str.substring(i, i + n));

				System.out.println();
			}

		}

	}

}
