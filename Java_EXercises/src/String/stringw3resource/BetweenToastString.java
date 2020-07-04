/*Write a Java program to return the substring that is between the first and last appearance of the substring 'toast' in the given string,
or return the empty string if substirng 'toast' does not exists. 

Sample Output:

The given strings is: sweettoastbuttertoast
The new string is: butter
 */
package String.stringw3resource;

public class BetweenToastString {

	public static void main(String[] args) {

		System.out.println(betweenToast("sweettoastbuttertoast"));
		System.out.println(betweenToast("sweetbutter"));
	}
	public static String betweenToast(String str) {
		String betweenToast = "";
		int toast1 = 0;
		int toast2 = 0;
		if (str.indexOf("toast")==-1) {
			
			return "no toast";
			
		}else {
			toast1 = str.indexOf("toast");
			toast2 = str.indexOf("toast", toast1+1);
			betweenToast = betweenToast + str.substring(toast1+5, toast2);
		}
		
		return betweenToast;
		
	}

}
