package StringManipulations;

public class Concat {

	public static void main(String[] args) {

		String s1 = "Welcome";
		String s2 = " hello";
		s1 = s1.concat(s2);
		System.out.println(s1);
		s1 = s2.concat(" to java");
		System.out.println(s1);
	}

}
