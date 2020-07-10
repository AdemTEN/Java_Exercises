/*uniqueChars is a method that you will code now, 
 should be able to accept any string in the world and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
 */
package StringReplQuestions;

public class repl_179_UniqueChar {

	public static void main(String[] args) {

		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {

		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.substring(0, i).contains(str.substring(i, i + 1))) {
				continue;
			} else {
				newStr = newStr + str.substring(i, i + 1);
			}
		}

		String reverseNewStr = "";
		for (int i = newStr.length() - 1; i >= 0; i--) {
			reverseNewStr = reverseNewStr + newStr.substring(i, i + 1);
		}
		return reverseNewStr;
	}
}
