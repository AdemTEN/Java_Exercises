/*Write a Java program to return true if the given string contains an appearance of 'abc' 
but not directly a period(.) and followed by. 

Sample Output:

The given strings is: testabc.test
Is 'abc' appear before period? true

The given string is: test.abctest
Is 'abc' appear before period? false
 */
package String.stringw3resource;

public class Contains_abc_BeforeDot {

	public static void main(String[] args) {

		System.out.println(contains_abc_BeforeDot("abcfsdgsgab.ffaf"));
		System.out.println(contains_abc_BeforeDot("abc.fsfaabc"));

	}

	public static boolean contains_abc_BeforeDot(String str) {
		boolean flag = true;
		if (str.contains("abc") && str.contains(".")) {

			int x = str.indexOf(".");
			if (str.indexOf("abc", x) == -1) {
				flag = true;
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		return flag;
	}

}
