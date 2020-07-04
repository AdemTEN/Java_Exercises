/*Write a Java program to read a string and return true if it ends in "ng".

Sample Output:

The given strings is: string
The string containing ng at last: true

The given strings is: strign
The string containing ng at last: false
*/
package String.stringw3resource;

public class Q_58_Endswith {

	public static void main(String[] args) {
		String str = "Strign";
		
		if(str.substring(str.length()-2).equals("ng")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
				

	}

}
