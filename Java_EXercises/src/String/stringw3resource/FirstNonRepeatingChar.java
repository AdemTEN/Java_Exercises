package String.stringw3resource;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String str = "gdaakgddffhhjf";

		for (int i = 0; i < str.length(); i++) {

			if (str.indexOf(str.substring(i, i+1), i+1) == -1) {
				
				System.out.println("first non repeated char is: " + str.substring(i, i + 1));
				
				break;

			}

		}
	}
}
