/*When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time,
 starting with one.  
 Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 * 
 */
package StringReplQuestions;

public class repl_178_MergeTwoString {

	public static String mergeStrings(String one, String two) {

		String mergeOneAndTwo = "";

		int length = 0;

		if (one.length() > two.length()) {

			length = one.length();

		} else {

			length = two.length();
		}

		for (int i = 0; i < length; i++) {

			if (i < one.length()) {

				mergeOneAndTwo = mergeOneAndTwo + one.substring(i, i + 1);
			}

			if (i < two.length()) {

				mergeOneAndTwo = mergeOneAndTwo + two.substring(i, i + 1);

			}

		}
		return mergeOneAndTwo;

	}

	public static void main(String[] args) {

		System.out.println(mergeStrings("12345", "abcde"));

	}

}
