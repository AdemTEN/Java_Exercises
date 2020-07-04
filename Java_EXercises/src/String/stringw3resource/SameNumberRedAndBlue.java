/*Write a Java program to check whether the string 'red' and 'blue' appear in same number of times in a given string. 
 
 Sample Output:

The given string is: redcapmanwithbluecar
The appearance of red and blue are same: true
 */
package String.stringw3resource;

public class SameNumberRedAndBlue {

	public static void main(String[] args) {

		System.out.println(isSameNumberRedAndBlue("redggsggblue"));
		System.out.println(isSameNumberRedAndBlue("ssagsdfhhsg"));
		System.out.println(isSameNumberRedAndBlue("redfaffbluffb"));
		
	}
	public static boolean  isSameNumberRedAndBlue(String str) {
		
		int countRed = 0;
		int countBlue = 0;
		
		//loop for red
		for (int i =0 ; i<str.length()-2;i++) {
			if (str.substring(i, i+3).equals("red")) {
				countRed++;
			}
		}
		
		//loop for blue
		for(int i = 0;i<str.length()-3;i++) {
			if(str.substring(i, i+4).equals("blue")) {
				countBlue++;
			}
		}
		if(countBlue == 0 || countRed == 0) {
			return false;
		}else if(countBlue == countRed) {
			return true;
		}else {
			return false;
		}
	}

}
