/*Write a Java program to return true when either of the two given strings appear 
at the end of the other string ignoring case sensitivity.

Sample Output:

The given strings are: xyz  and pqrxyz
Is one string appears at the end of other? true

The given strings are: pqrxyz  and xyz
Is one string appears at the end of other? true
 */
package String.stringw3resource;

public class TwoStringAppearsAtTheEnd {

	public static void main(String[] args) {
		
		System.out.println(twoStringAppearsAtTheEnd("xyz","pqrxyz" ));
		System.out.println(twoStringAppearsAtTheEnd("pqrxyz", "xyz"));
		System.out.println(twoStringAppearsAtTheEnd("sfsdfsf", "sfsfgfh"));
		
	}
	public static boolean twoStringAppearsAtTheEnd(String str1, String str2) {
		
		if(str1.endsWith(str2) || str2.endsWith(str1)) {
			return true;
			
		}else {
			return false;
		}
	}

}
