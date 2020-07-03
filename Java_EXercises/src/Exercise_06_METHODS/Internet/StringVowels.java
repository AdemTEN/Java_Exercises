package Exercise_06_METHODS.Internet;

public class StringVowels {

	public static void main(String[] args) {

		String str = "HELLO world how are you?";
		int vowels = vowels(str);
		System.out.println(vowels);
		CountWord countwords = new CountWord();
		System.out.println(countwords.countWord(str));
		
		
		
	}
	
	public static int vowels(String str) {
		str = str.toLowerCase();
		int count = 0;
		for (int i = 1; i<=str.length()-1; i++) {
			char ch = str.charAt(i);
			if(ch =='a'|| ch=='e'|| ch == 'o'||ch=='u' || ch== 'i') {
				count++;
			}
		}
		return count;
	}

}
