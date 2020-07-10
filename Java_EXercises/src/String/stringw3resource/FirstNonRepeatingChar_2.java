package String.stringw3resource;

public class FirstNonRepeatingChar_2 {

	public static void main(String[] args) {
		
		System.out.println(firstNonRepeatingChar("bbleabbler") );
		
		

	}
	public static String firstNonRepeatingChar(String str) {
		String nonRepeatingChar= "";
		for(int i = 0; i<str.length();i++) {
			
			if(str.indexOf(str.substring(i, i+1), i+1)==-1) {
				nonRepeatingChar += str.substring(i, i+1); 
				break;
			}else {
				continue;
			}
		}
		return nonRepeatingChar;
		
	}

}
