package StringManipulations;

public class CharAt {

	public static void main(String[] args) {

		String name = "Adem TEN Welcome to Java World!!!" ;
		char ch = name.charAt(7);
		System.out.println(ch);
		int nameLength = name.length();
		System.out.println("First Character of name is: " + name.charAt(0));
		System.out.println("Last Character of name is:  "  + name.charAt(nameLength-5) );
	}

}
