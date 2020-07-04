/*Write a Java program to check whether a string is pq-balanced or not.
 A String is pq-balanced if for all the p's in the string atleast one 'q' must exists right of the p's.
 But 'q' before the 'p' makes the pq-balanced false. 

Sample Output:

The given strings is: gfpmpnppqab
The string is pq-balanced? true

The given strings is: gfpmpnpqpab
The string is pq-balanced? false
 */
package String.stringw3resource;

public class pqBalance {

	public static void main(String[] args) {

		System.out.println(pqBalance("gfpmpvppqab"));
		System.out.println(pqBalance("gfpmpnpqpaqb"));

	}

	public static boolean pqBalance(String str) {

		if (str.indexOf("p") == -1 || str.indexOf("q") == -1) {
			return false;

		} else {
			int x = str.indexOf("q");

			if (str.indexOf("p", x) == -1) {
				return true;

			} else {
				return false;
			}
		}

	}

}
