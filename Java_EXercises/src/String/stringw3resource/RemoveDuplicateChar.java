package String.stringw3resource;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		System.out.println(removeDuplicateChar("w3resource"));
	
		
	}
	
	public static String removeDuplicateChar(String str) {
	String newStr = "";	
		for(int i = str.length()-1;i>=0;i--) {
			
			if(str.substring(0, i).contains(str.substring(i, i+1 ))) {
			
				continue;
				
		}else {
			newStr = newStr + str.substring(i, i+1);
		}
			
	}
		String reverseNewStr = "";
		for (int i = newStr.length()-1; i>=0; i--) {
			
			reverseNewStr = reverseNewStr + newStr.substring(i, i+1);
			
			
		}
		return reverseNewStr;
}
}
