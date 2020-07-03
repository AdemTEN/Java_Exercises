package StringManipulations;

public class CompareTo {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		String s6 = "";//
		String s7 = "me";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareTo(s6));//If you compare string with blank or empty string, it returns length of the string.
		System.out.println(s1.compareTo(s7));
		
		
		
	}

}
