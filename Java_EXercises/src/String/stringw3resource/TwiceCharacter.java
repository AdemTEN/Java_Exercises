package String.stringw3resource;

public class TwiceCharacter {

	public static void main(String[] args) {

		System.out.println(twiceCharacter("welcome"));
		
		
		
	}

	public static String twiceCharacter(String str) {

		String newStr = "";
		for (int i = 0; i < str.length(); i++) {

			newStr = newStr + str.substring(i, i + 1).concat(str.substring(i, i + 1));

		}
		return newStr;
	}
}
