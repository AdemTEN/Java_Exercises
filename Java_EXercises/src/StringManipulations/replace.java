package StringManipulations;

public class replace {

	public static void main(String[] args) {

		String s1 = "Welcome to Java";
		String s2 = s1.replace('a', 'e');
		System.out.println(s2);
		s2 = s1.replace("Java", "c++");
		System.out.println(s2);
	}

}
