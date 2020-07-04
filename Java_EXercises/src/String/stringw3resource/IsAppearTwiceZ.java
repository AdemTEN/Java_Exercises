/*Write a Java program to check whether the first instance of 'z' is 
 * immediately followed by another 'z' in a given string. 

Sample Output:

The given string is: fizzez
Is 'z' appear twice respectively? true
 */
package String.stringw3resource;

public class IsAppearTwiceZ {

	public static void main(String[] args) {

		System.out.println(isAppearTwiceZ("pizza"));
		System.out.println(isAppearTwiceZ("fizez"));
	}

	public static boolean isAppearTwiceZ(String str) {
		boolean flag = false;
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.substring(i, i + 1).equals("z")) {
				if (str.substring(i + 1, i + 2).equals("z")) {
					flag = true;
				}
			} else {
				flag = false;
			}
		}
		return flag;
	}

}
