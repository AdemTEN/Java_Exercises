/* Write a Java program to read a string and returns after remove the # 
  and its immediate left and right characters. 

Sample Output:

The given strings is: test#string
The new string is: testring

The given strings is: test##string
The new string is: testring

The given strings is: test#the#string
The new string is: teshtring
 */
		
package String.stringw3resource;

public class RemoveHash {

	public static void removingHash(String str) {
		boolean isHash = false;
		do {
			int repeatedHash = 0;
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) == '#') {
					for (int y = i + 1; y < str.length(); y++) {
						if (str.charAt(y) == '#')
							repeatedHash++;
						else
							break;
					}
					str = str.substring(0, i - 1).concat(str.substring(i + 2 + repeatedHash, str.length()));

				}
			}
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '#') {
					isHash = true;
				} else {
					isHash = false;
				}
			}

		} while (isHash);

		System.out.println(str);
	}

	public static void main(String[] args) {
		removingHash("test#string");
		removingHash("test#the#string");
		removingHash("test####string");

	}

}
