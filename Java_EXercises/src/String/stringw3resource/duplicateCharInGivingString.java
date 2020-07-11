package String.stringw3resource;

public class duplicateCharInGivingString {

	public static void main(String[] args) {
		
		String str1 = "the quick brown fox";
		String str2 = "queen";
		
		String newStr1 = "";
		
		for ( int i = 0; i<str1.length(); i++) {
			
			if(str2.indexOf(str1.substring(i, i+1)) == -1) {
				newStr1 += str1.substring(i, i+1); 
			}else {
				continue;
			}
		}
		System.out.println(newStr1);

	}

}
