package StringManipulations;

public class Contains {

	public static void main(String[] args) {

		String sentence = "What doo you know about me?";
		System.out.println(sentence.contains("What"));
		System.out.println(sentence.contains("how"));
		System.out.println(sentence.contains("about me"));
		boolean s1 = sentence.contains("you");
		System.out.println(s1);
		if (sentence.contains("doo")) {
			System.out.println("Sentence contains doo ");
		}
		
		System.out.println(sentence.endsWith("about me?"));
		System.out.println(sentence.endsWith("?"));
		System.out.println(sentence.length());
		if (sentence.endsWith("?")) {
			String s8 = sentence.concat(" say me");
			System.out.println(s8);
		}else {
			System.out.println("No found");
		}
	}

}
