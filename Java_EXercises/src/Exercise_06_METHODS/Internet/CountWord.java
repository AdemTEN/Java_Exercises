package Exercise_06_METHODS.Internet;

public class CountWord {

	public static void main(String[] args) {
		String str = "Hello java how are you today what did you dou in your life?";
		System.out.println(countWord(str));
		

	}
	public static int countWord(String str) {
		int count = 0;
		for (int i =1 ;i<=str.length()-1; i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		return count + 1 ;
		
	}

}
