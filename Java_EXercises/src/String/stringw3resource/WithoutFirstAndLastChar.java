/*Write a Java program to read a string and if the first or last characters are 't',
 *  return the string without those 't' otherwise return the string unchanged. 

Sample Output:

The given strings is: testcricket
The new string is: estcricke 
 */
package String.stringw3resource;

public class WithoutFirstAndLastChar {

	public static void main(String[] args) {

		System.out.println(withoutFirstAndLastChar("testcricket"));
		
	}
	
	public static  String withoutFirstAndLastChar(String str) {
		
		if(str.substring(0, 1).equals("t")&& str.substring(str.length()-1).equals("t")){
			return str.substring(1, str.length()-1); 
		}else {
			return str;
		}
	}

}
