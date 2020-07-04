/*Write a Java program to check whether a string 'abc' in the middle of a given string. 
Here middle means the number of character to the left and right of the substring 
'abc' must differ by at most one. 

Sample Output:

The given string is: xxxabcxxxxx
Is abc appear in middle? false

The given string is: xxabcxxx
Is abc appear in middle? true 
 */
package String.stringw3resource;

public class Is_abc_InTheMiddle {

	public static void main(String[] args) {

		System.out.println(is_abc_InTheMiddle("xxxxabcxxx"));
		System.out.println(is_abc_InTheMiddle("xxxabcxx"));
		System.out.println(is_abc_InTheMiddle("xabcxxx"));
		System.out.println(is_abc_InTheMiddle("abcxxxx"));
		System.out.println(is_abc_InTheMiddle("xxxx"));
		System.out.println(is_abc_InTheMiddle("xxabcxxx"));
	}

	public static boolean is_abc_InTheMiddle(String str) {

		if (str.indexOf("abc") == 0 || str.indexOf("abc") == -1) {
			return false;
		} else {

			int abc = str.indexOf("abc");
			String before_eabc = str.substring(0, abc);
			String after_abc = str.substring(abc + 3);

			int length_before_abc = before_eabc.length();
			int length_after_abc = after_abc.length();

			// Swap two numbers

			if (length_before_abc < length_after_abc) {
				length_before_abc = length_before_abc + length_after_abc;
				length_after_abc = length_before_abc - length_after_abc;
				length_before_abc = length_before_abc - length_after_abc;
			}

			if ((length_before_abc - length_after_abc == 0) || (length_before_abc - length_after_abc == 1)) {
				return true;
			} else {
				return false;
			}

		}
	}

}
