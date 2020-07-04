/*Write a Java program to read a string and return true if "good" 
appears starting at index 0 or 1 in the given string. 

Sample Output:

The given strings is: goodboy
The 'good' appear in the string is: true
 */
package String.stringw3resource;

public class Q_62_goodAppers0_1Index {

	public static void main(String[] args) {
		String str = "ggooboox";
		if (str.length() <= 3) {
			System.out.println(false);
			return;
		} else if (str.length() == 4) {
			if (str.substring(0).equals("good")) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			if (str.substring(0, 4).equals("good") || str.substring(1, 5).equals("good")) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}
}
