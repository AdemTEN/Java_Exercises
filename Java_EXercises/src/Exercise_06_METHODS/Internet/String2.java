package Exercise_06_METHODS.Internet;

public class String2 {

	public static void main(String[] args) {
		String str = "Hello World java";
		String s = middleString(str);
		System.out.println(s);

		StringVowels vowels = new StringVowels();
		System.out.println(vowels.vowels(str));

	}
	public static String middleString(String str) {
		int position;
		int length;
		
		if (str.length() % 2 ==0) {
			position = str.length() / 2 -1;
			length = 2;
		}
		else {
			position = str.length() /2;
			length= 1;
		}
		return str.substring(position, position + length);
	}

}
