/*Write a Java program to return true if the number of appearances of 'the' and 'is' 
anywhere in the string is equal. 

Sample Output:

The given string is: Thisisthethesis
Are the appearance of 'the' and 'is' equal? false 
 */
package String.stringw3resource;

public class isSameNumberTheAndIs {

	public static void main(String[] args) {

		System.out.println(isSameNumberTheAndIs("thisisthetheisisisthet"));
		System.out.println(isSameNumberTheAndIs("the lskjsfisthes lsfis"));
	}

	public static boolean isSameNumberTheAndIs(String str) {

		int isCount = 0;
		int theCount = 0;
		// loop for is

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("is")) {
				isCount++;
			}
		}
		// loop for the
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("the")) {
				theCount++;
			}
		}

		if (isCount == 0 && theCount == 0) {
			return false;
		} else if (isCount == theCount) {
			return true;
		} else {
			return false;
		}
	}

}
